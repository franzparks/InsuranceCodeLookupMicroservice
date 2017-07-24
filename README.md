# InsuranceCodeLookupMicroservice
A look up micro service for industry codes in the insurance industry
- Developed using SpringBoot, Spring Cloud(With a Netflix Eureka Server for microservice registration and discovery)
- Currently uses Thymeleaf as a templating engine but will soon be migrated to the wonderful React/Redux
- The Web Application also registers with the microservice registry(unnecessary step and will later be removed)
- Since the registry, microservice and web app (which encapsulates the microservice for much easier consumption) all run on Tomcat,
run the applications in this order in dev: RegistrationServer.java (registry can be seen on http://localhost:1111/), then 
LookupMicroServiceApplicationServer.java (the micro service which gets data from the pdf and makes it available as a service and runs on 
http://localhost:2222/), and then WebServer.java (the web server). The webserver still has some issues, will try to resolve them asap.

