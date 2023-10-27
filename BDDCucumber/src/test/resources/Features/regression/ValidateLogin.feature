Feature: To validate login functionality

Scenario: To validate login using valid credentials

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters  username "jaydeep99" using xpath "//input[@name='username']" 
And user enters  password "jaydeep123" using xpath "//input[@name='password']"
And user click button using xpath "//input[@name='login']"
Then user validate title to be "Adactin.com - Search Hotel"
