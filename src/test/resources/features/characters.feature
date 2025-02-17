Feature: Characters
  Scenario: Correct number of characters found
    Given the user has the application available
    When the user runs the application with arguments "<input>"
    Then the output should contain <vowels> vowels and <consonants> consonants
  Examples:
    | input         | vowels | consonants |
    | Test          | 1      | 3          |
    | bcd           | 0      | 3          |
    | aaee          | 4      | 0          |
    | a123b         | 1      | 1          |
    | **xd12sdee    | 2      | 4          |
    | aeiouyAEIOUY  | 12     | 0          |
  
  Scenario: Maximum allowed arguments
    Given the user has the application available
    When the user runs the application with arguments "Test1 Test2 Test3 Test4"
    Then the output should not contain an error

  Scenario: Too many arguments
    Given the user has the application available
    When the user runs the application with arguments "Test1 Test2 Test3 Test4 Test5"
    Then the output should contain an error

  Scenario: No arguments passed
    Given the user has the application available
    When the user runs the application with no arguments
    Then the output should contain an error
