/**
 * 
 */
package com.insurance.utils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

enum CODES { ISO_DESC, ISO_CGL, SIC, NAICS, GENERAL_DESC, NCCI, CA_WC, DE_WC, MI_WC, NJ_WC, NY_WC, PA_WC, TX_WC}

/**
 * @author francisphiri
 *
 */
public class PDFManager {
	
	private String filePath;
	
	public PDFManager() {
        
    }
    public String ToText(){
	   PDDocument document = null; 
	   String text = "";
	   try{
			
			document = PDDocument.load(new File(filePath));
			document.getClass();
			if( !document.isEncrypted() ){
			    PDFTextStripperByArea textStripper = new PDFTextStripperByArea();
			    textStripper.setSortByPosition( true );
			    PDFTextStripper Tstripper = new PDFTextStripper();
			    Tstripper.setLineSeparator("\n");
			    text = Tstripper.getText(document);
			}
			}catch(Exception e){
			    e.printStackTrace();
			}

	   return text;
    }
    
    public  List<Map<String, String>> getListOfMappings(String[] arr){
    	
		List<Map<String, String>> listOfRowsOfMappings = new ArrayList<>();
		Map<String, String> currentlyProcessedCodes = new HashMap<>();
		
		for(String line: arr){
			Stack<CODES> stackOfKeys = loadStack();
			line = line.trim();
			if(line.contains("ISO") || line.contains(".com")){ continue; }
			String[] codesFromArray = line.split("\\s");
			
			while(!stackOfKeys.isEmpty()){
				
				CODES currentKey = stackOfKeys.pop();
				
				for(int i = 0; i < codesFromArray.length; i++){
					if(i == 0 && !isNumber(codesFromArray[i])){
						int j = i;
						String build_ISO_Description = "";
						while(j < codesFromArray.length && !isNumber(codesFromArray[j])){ //build the description for ISO_DESC
							build_ISO_Description += codesFromArray[j] + " ";
							j++;
						}
						currentlyProcessedCodes.put(currentKey.toString(), build_ISO_Description);
						i = j-1;
					}else if(i > 0 && !isNumber(codesFromArray[i])){
						int j = i;
						String buildGeneralDescription = "";
						while(j < codesFromArray.length && !isNumber(codesFromArray[j])){ //build the description for General_DESC
							buildGeneralDescription += codesFromArray[j] + " ";
							j++;
						}
						currentlyProcessedCodes.put(currentKey.toString(), buildGeneralDescription);
						i = j-1;
						
					}else{
						if(codesFromArray.length > 1 && i == 0 && !currentlyProcessedCodes.containsKey(CODES.ISO_DESC)){
							currentlyProcessedCodes.put(CODES.ISO_DESC.name(), "");
							currentlyProcessedCodes.put(CODES.ISO_CGL.name(), "");
							if(!stackOfKeys.isEmpty()){
								currentKey = stackOfKeys.pop();
							}
							
							if(!stackOfKeys.isEmpty()){
								currentKey = stackOfKeys.pop();
							}
							currentlyProcessedCodes.put(currentKey.toString(), codesFromArray[i]);
						}else{
							currentlyProcessedCodes.put(currentKey.toString(), codesFromArray[i]);
						}
					}
					if(!stackOfKeys.isEmpty()){
						currentKey = stackOfKeys.pop();
					}
				}
			}
			//
			listOfRowsOfMappings.add(currentlyProcessedCodes);
			currentlyProcessedCodes = new HashMap<>();
		}
		
		//System.out.println(listOfRows);
		return listOfRowsOfMappings;
	}
	
	private static boolean isNumber(String word){
		try{
			Integer.parseInt(word);
			return true;
		}catch(Exception e){
			
		}
		return false;
	}
	
	private static Stack<CODES> loadStack(){
		Stack<CODES> stackOfKeys = new Stack<CODES>();
		stackOfKeys.push(CODES.TX_WC);
		stackOfKeys.push(CODES.PA_WC);
		stackOfKeys.push(CODES.NY_WC);
		stackOfKeys.push(CODES.NJ_WC);
		stackOfKeys.push(CODES.MI_WC);
		stackOfKeys.push(CODES.DE_WC);
		stackOfKeys.push(CODES.CA_WC);
		stackOfKeys.push(CODES.NCCI);
		stackOfKeys.push(CODES.GENERAL_DESC);
		stackOfKeys.push(CODES.NAICS);
		stackOfKeys.push(CODES.SIC);
		stackOfKeys.push(CODES.ISO_CGL);
		stackOfKeys.push(CODES.ISO_DESC);
		return stackOfKeys;
	}
   
    public void setFilePath(String filePath) {
       this.filePath = filePath;
    }
}
