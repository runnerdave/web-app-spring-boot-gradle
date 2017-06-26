# Demo of a simple web application using Spring Boot with thymeleaf

Simple demo that demonstrates the usage of:

* Thymeleaf
* Error handling
* Exception handling with ControllerAdvice

## Problem
### Exercise

* Create a new application using the Spring Initializr
* Select Web dependency
* Select Template dependency (your choice which one)
* Create an index.html template in the static folder
what happens when you run the app and go to http://localhost:8080
* Create a controller package
* create a controller (@Controller)
* create a couple of methods with request mappings
* Create a service package
    * create a service (don't forget the @Service annotation)
    * create a method that will return some data (any data)
* Views
    * create some templates (in the templates folder) that will be displayed and match your controller requests
    * create some static content to include in those views (css/images/js)
add static content to your views using one or more of the following
manually (example: download bootstrap and drop it in your project)
        * Webjars
        * bower
* Error Handling
    * create a custom error handler template
    * create a cool 404 page
* Exception Handling
    * have one of your controller methods throw an exception
catch that exception in the controller using @ExceptionHandler
catch the exception using Controller Advice

## Solution
The web app will simulate an online seller for music concerts.     
                                                                                       
## Build
``$gradle build``
                                                                                       
## Run
``$java -jar build/libs/web-app-spring-boot-gradle-0.0.1-SNAPSHOT.jar``
                                                                                       
## See it in action
[http://localhost:8899/]                                                                                       