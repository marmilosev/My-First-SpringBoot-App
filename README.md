# MyFirstSpringBootApp
Creating simple Spring Boot App with Spring Tool Suite IDE (STS IDE)
Steps in creating simple Spring Boot App with Spring Tool Suite IDE (STS IDE)
1. Download STS IDE - process explained on: https://www.codejava.net/frameworks/spring/install-spring-tool-suite-windows
2. Open Spring Tool Suite IDE
3. File > New > Spring Starter Project
4. Change Name, Description, Group and Package names
5. Click on Next
6. Choose which Dependency/ies would you like to use in your project (I used Web > Spring Web)
7. Click on Next and then the URL for Spring Boot App is shown (because every project is zipped and downloaded)
8. Position yourself in myfirstspingbootapp (name of the project) > src/main/java > com.springboot (name of the package) > MyfirstspringbootappApplication.java (file with .java extension)
* In that file we can see annotation @SpringBootApplication which is annotation that indicates starting point of Application and there is already main method which can be run to make sure everything is okay
* After click on run - you need to choose that this project should be runned as Spring Boot App
* By running our project we can se that application started using Java and that application uses Tomcat as a service which is started on port 8080 (but we can change port in src/main/resources > application.properties where you need to write server.port = numberOfPort (e.g. 9001))
9. Write in browser in address bar: http://localhost:8080/ or number of port that you changed.
10. It should be written on page: "Whitelabel Error Page" because we didn't put any annotation or lines of code to show our text.
11. Inside package where our .java file is created, another class (I named it Controller.java) should be created.
12. In new class first we put annotation @RestController to mark request handler.
13. Then we add @RequestMapping("/test") 
14. Inside declaration of class the method which returns "Hello World!" was created.
15. Above method annotation @GetMapping is added.
16. Run this project. (If it is already runned (port is in use) then project first should be stopped).
17. In browser address bar, on the end of the URL add "/test" because that is the folder which is declared to use in annotation in step 13.
18. Refresh page and it is written "Hello World!"
