Feature: Login Funtionlity




@Reg
Scenario: login with valid details
When user enter "sarika" and "Sa@123"
And user clicks on login button
Then Validate succesful login
Then user clicks on Dashboard
@Reg
Scenario: login with invalid details
When user enter "standard_test" and "secret_test"
And user clicks on login button
Then validate error message

@Reg2
Scenario: login when user name is wrong and password is correct
When user enter "standard_test" and "Sa@123"
And user clicks on login button
Then validate error message
