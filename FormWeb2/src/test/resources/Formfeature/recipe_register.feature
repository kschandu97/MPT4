Feature: RegistrationForm 

Scenario: First Name Validation
Given User is on register page
When firstname is invalid
Then then show message invalid firstname

Scenario: Last Name Validation
Given User is on register page
When lastname is invalid
Then then show message invalid lastname


Scenario: email Validation
Given User is on register page
When email is invalid
Then then show message invalid email

Scenario: Mobile Validation
Given User is on register page
When Mobile no is invalid
Then then show message invalid mobile no

#Scenario: Mobile Validation
#Given User is on register page
#When Mobile no is less than 10 digits
#Then then show message 'Enter 10 digits Mobile number'

Scenario: Category Validation
Given User is on register page
When Category is invalid
Then then show message invalid category

Scenario: Mode of Learning Validation
Given User is on register page
When mode is invalid
Then then show message invalid mode

Scenario: Course Duration Validation
Given User is on register page
When duration is invalid
Then then show message invalid duration


Scenario: Enquiry Validation
Given User is on register page
When Enquiry details are invalid
Then then show message invalid Enquiry details


Scenario: Valid details
Given User is on register page
When all valid details
Then then go to success page
