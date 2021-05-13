Feature: CUST-1234 - validate response body format

    The Version controller should return a properly formatted string that contains Double value and terminated with a newline character.

    Scenario Outline: user requests the version of the app using /version API
        Given a user who wants to know the version of the API
        When user requests the version with /version
        Then version API response should respond with a Double-formatted value
        And version API response should end with a newline character
        