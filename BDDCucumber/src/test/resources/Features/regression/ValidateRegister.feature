Feature: To validate registration functionality

@rdj419
Scenario: To validate registration with vaild input data

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[text()='New User Register Here']"
Then user validate title to be "Adactin.com - New User Registration"
When user enters text "jaydeep456" using xpath "//input[@name='username']"
And user enters text "jaydeep321" using xpath "//input[@name='password']"
And user enters text "jaydeep321" using xpath "//input[@name='re_password']"
And user enters text "jaydeep k" using xpath "//input[@name='full_name']"
And user enters text "jaydeep@gmail.com" using xpath "//input[@name='email_add']"
And user enters text "ungive" using xpath "//input[@name='captcha']"
And user clicks on checkbox using xpath "//input[@name='tnc_box']"
And user clicks on submit using xpath "//input[@name='Submit']"