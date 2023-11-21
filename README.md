# Prescription-Management-System

Technologies used:
1. Spring boot framework
2. JavaScript
3. MySql
4. Java 17
5. Bootstrap
6. css
7. Html
8. MVC architecture
9. Spring Tool Suite 4

spring boot dependency:

1.spring-boot-starter-data-jpa

2. starter-web
   
3.spring-boot-devtools

4. mysql-connector-j
   
5. spring-boot-starter-thymeleaf
   
6. lombok
   
7.spring-boot-starter-security

## Funcitonal Requirements:
1. No anonymous users are allowed to use the system. They will be redirected to login page for login.(here used dummy credentials) 

2.After login, show a list of prescription generated for a particular date range (by default the current month) in tabular format. This date range can be selected/changed by the user and the result will be shown accordingly.

3.Allow the authenticated users to create new prescription which will be saved in DB. You can use in-memory db or any other db of your choice. Note that you should show proper error messages on form submission when invalid data is submitted. The prescription will contain:

        ○ Prescription Date (valid date, mandatory)
        
        ○ Patient Name (text, mandatory)
        
        ○ Patient Age (integer, valid age range, mandatory)
        
        ○ Patient Gender (select box, mandatory)
        
        ○ Diagnosis (text area)
        
        ○ Medicines (Text area)
        
        ○ Next visit date (valid date, optional)

4. Make form validation in client side too using Javascript
5.  Allow user to edit a prescription entry
6. Allow user to delete a prescription entity.Ask for confirmation before deleting any prescription entry
7. Create a report: Day wise prescription count [day, prescription count]
8. Create a REST API to get prescription list (GET /api/v1/prescription) which will return
JSON
9. Consume this REST API, show it in tabular format in a page:
