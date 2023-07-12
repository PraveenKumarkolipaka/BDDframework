Feature: Login

Scenario: Successful login with valid creadientials
Given User Launch the chrome browser
When User open the URL "https://www.facebook.com/"
When User enter email as "9550495586" and password as "9347440829@kpkp"
And User click on login
When User click on logout link
And close browser 