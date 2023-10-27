Feature: To validate login functionality

  @smoke @regression @wip09
  Scenario: To validate login using valid credentials
    Given user starts "chrome" browser
    And user launch app using url "https://adactinhotelapp.com/"
    When user enters  username "jaydeep99" using xpath "//input[@name='username']"
    And user enters  password "jaydeep123" using xpath "//input[@name='password']"
    And user click button using xpath "//input[@name='login']"
    Then user validate title to be "Adactin.com - Search Hotel"

  @regression
  Scenario Outline: To validate Login using Invalid credentials
    Given user starts "chrome" browser
    And user launch app using url "https://adactinhotelapp.com/"
    When user enters  username '<username>' using xpath "//input[@name='username']"
    And user enters  password '<password>' using xpath "//input[@name='password']"
    And user click button using xpath "//input[@name='login']"
    Then user validate title to be '<expTitle>'

    Examples: 
      | username  | password   | expTitle                               |
      | jaydeep22 | jaydeep123 | Adactin.com - Hotel Reservation System |
      | jaydeep99 | jaydeep13  | Adactin.com - Hotel Reservation System |
      | jaydeep22 | jaydeep12  | Adactin.com - Hotel Reservation System |
