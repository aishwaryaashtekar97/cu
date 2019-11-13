Feature: Test Registration

Description: with all parameters

Scenario: Test Registration with valid data

Given open the testMe app
When click on SignIn page
When click on Register here

When user enter username as "Aishwarya2" in username field
When user enter the firstname as "Aishwarya" in firstname field
When user enter the lastname as "Ashtekar" in lasname field
When user enter Password as "Aish111" in password field
When user enter confirmPassword as "Aish111" in confirmpassword field
When user select Gender as "gender" in gender field
When user enter Email as "aishuashtekar97@gmail.com" in email field
When user enter MobileNumber as "8999947761" in mobilenumber field
When user enter DOB as "15/20/1998" in DOB field
When user enter Adress as "pune sgfdafg fhskwhg glewjy gukwyd" in Address field
When user select SecurityQuestion as "securityquestion" in securityquestion field
When user enter Answer as "cat" in Answer field
And Click on Register
#Then user validate Register successss



