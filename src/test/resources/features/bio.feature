Feature: Andres Cepeda
  @Bio
  Scenario: Interact to website on the option home Andres Cepeda
    Given that enter the page "https://andrescepeda.com.co/" and
    When select the option Bio and select the one publication
    Then you should see on the console the biography information provided by the website