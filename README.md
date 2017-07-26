# InsuranceCodeLookupMicroservice
A look up micro service for industry codes in the insurance industry
- Developed using SpringBoot, Spring Cloud(With a Netflix/Spring Eureka Server for microservice registration and discovery)
- Currently uses Thymeleaf as a templating engine but will later be migrated to the wonderful React/Redux (or Angular2)
- The Web Application also registers with the microservice registry(unnecessary step but make the eureka dashboard look nice with more than one registered service!)
- Since the registry, microservice and web app (which encapsulates the microservice for much easier consumption) all run on Tomcat(same instance but different ports),
run the applications in this order in dev: RegistrationServer.java (registry can be seen on http://localhost:1111/), then 
LookupMicroServiceApplicationServer.java (the micro service which gets data from the pdf and makes it available as a service and runs on 
http://localhost:2222/), and then WebServer.java (the web server which runs on http://localhost:3333/). 
- App will soon be deployed to aws beanstalk for public consumption and documentation updated to show how to access the microservice better
- So far the restful APi works best:
URIs to try:
- /codes/cacw/{codeNumber}
- /codes/naics/{codeNumber}
- /codes/ncci/{codeNumber}
- /codes/doSearch/{codeNumber} //searches all 3 categories

