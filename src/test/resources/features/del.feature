Feature: Deletes Address from MY ADDRESSES page

Scenario: The Users delete address in Application

Given The Users navigate to login page of the ecommerces application
When The Users enter below details

|Email address|samyou91@gmail.com|
|Password     |Samcatdogboy4@    |

And The Users click on Signin button

Then The users opens his profile on the ecommerce application

When The Users click on MY ADDRESSES button 
And The Users click on delete button 
#And User view alert window and click on OK button
Then The Users will view No addresses are available 
