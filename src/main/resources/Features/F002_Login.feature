@smoke
 Feature:users could use login functionality to use their accounts
   Scenario: : user could login with valid email and password
     Given user navigate to login page
     When login with valid "mohamed@gmail.com" and "123456"
     Then  user press on login button
     And  user login to the system successfully


   Scenario: user could login with invalid email and password
     Given user navigate to login page
     When login with invalid email "mohamedm.salem192020@gmail.com" and invalid password "P@ssw0r"
     Then user press on login button
     And user could not login to the system
