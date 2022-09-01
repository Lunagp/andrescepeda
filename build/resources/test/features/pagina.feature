Feature: enter the page
  @InfoNews
  Scenario: Interact to website on the option News
    Given Since you enter the website "https://andrescepeda.com.co/"
    When you select the News option and select a publication
    Then You will then need to validate that the information provided by the page is displayed in the console and compared to a text.

  @InfoBio
  Scenario: Interact to website on the option Bio
    Given Since you enter the website "https://andrescepeda.com.co/"
    When When you select the BIO option
    Then When you select the BIO option bio

  @InfoEvent
  Scenario: Interact to website on the option Events
    Given Since you enter the website "https://andrescepeda.com.co/"
    When When you select the Events option and the Upcoming Events option
    Then When you select the Events option and the Upcoming Events option event

  @InfoPhotos
  Scenario: Interact to website on the option Photos
    Given Since you enter the website "https://andrescepeda.com.co/"
    When select the option Photos and select the one publication
    Then you should see on the console the photos information provided by the website

  @InfoStore
  Scenario: Interact to website on the option Store
    Given Since you enter the website "https://andrescepeda.com.co/"
    When select the option Store and buy two items
    Then you should see on the console the items information provided by the website