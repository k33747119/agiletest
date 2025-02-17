# List of bugs

## No error on entering 0 strings
Description: The user is not informed of invalid input if no input was provided
Arguments: none
Steps:
1. Run program with no arguments passed
... further information such as affected version, priority, test environments

## Error when entering 4 strings
Description: The maximum number of allowed arguments does not align with the story
Expected: Can pass 4 arguments
Arguments: test test test test
Steps:
1. Run program with 4 arguments
2. An error is returned: "Extra arguments passed."

## Doesn't count capital vowels
Description: Only lowercase values are checked
Expected: Lower and upper case vowels are checked
Arguments: AAAAA
Steps:
1. Run program with argument containing uppercase letters

## Doesn't count Y as a vowel
Description: Y is not counted as a vowel
Expected: Y is counted as a vowel
Arguments: aeiouy
Result/expected: 5 (6)