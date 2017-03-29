Feature: Login feature

  Scenario: Login with unregistered number
    Given On Homepage tap existing user
    When On Register Page tap number field and fill 818234123
    And On Register Page tap password field and fill 1234
    Then On Register Page tap Sign In after fill the requirement