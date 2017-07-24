/**
 * 
 */
package com.insurance.utils;
import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
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
   
    public void setFilePath(String filePath) {
       this.filePath = filePath;
    }
}
