#Author: rbarbosait@gmail.com
#Keywords Summary : Baufest Automation Test

@tag
Feature: Test demoBlaze web page
  I want to test some required actions through Google chrome

  @tag1_navigateToPage
  Scenario: Navigate to demoBlaze web
    Given I lunch Google Chrome browser
    When I navigate to the url
    Then I validate the title of the web page
   
#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
