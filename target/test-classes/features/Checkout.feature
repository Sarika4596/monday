Feature: Baseket Functionlity 




@Reg2 
Scenario: To check checkout page 
When user enter "standard_user" and "secret_sauce" 
And user clicks on login button 
When user clicks on cart 
And user clicks on checkout 
And user enter "sarika" and "sharma" and "201102" 
Then clicks on continue button 
Then clicks on finish button
@Reg3
Scenario: To check checkout page with invalid data
When user enter "standard_user" and "secret_sauce" 
And user clicks on login button 
When user clicks on cart 
And user clicks on checkout 
And user enter "sarika" and "" and "201102" 
Then clicks on continue button 
Then validate error1 message


@Reg4
Scenario: To check checkout page with end to end testing
When user enter "standard_user" and "secret_sauce" 
And user clicks on login button 
And user add product into the cart
When user clicks on cart
Then clicks on remove button
And user clicks on checkout 
And user enter "sarika" and "sharma" and "201102" 
Then clicks on continue button 
Then clicks on finish button


