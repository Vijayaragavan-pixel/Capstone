Feature: OrangeHRM Login


 Scenario: User tries to log into OrangeHRM
    Given User launches OrangeHRM
    When User enters "Admin" in username
    And User enters "admin123" in password
    Then User clicks login