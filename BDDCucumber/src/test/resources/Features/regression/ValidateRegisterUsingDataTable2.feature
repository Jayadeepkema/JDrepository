Feature: To validate registration functionality

@rdj417
Scenario: To validate registration with vaild input data

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[text()='New User Register Here']"
Then user validate title to be "Adactin.com - New User Registration"
When use enters details in registration form using headers
| username | password | confirm password | full name | Email id | captcha |
| jaideep14 | jaideep54 | jaideep54 | jaideep j | jaideep@gmail.com | zoho |
And user clicks on checkbox using xpath "//input[@name='tnc_box']"
And user clicks on submit using xpath "//input[@name='Submit']"