package steps;

import com.exercise.CharacterCounter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    private String output;

    @Given("the user has the application available")
    public void the_user_has_the_application_available() {
        output = "";
    }

    @When("the user runs the application with arguments {string}")
    public void the_user_runs_the_application_with_the_arguments(String string) {
        runApplication(string);
    }

    //When the user runs the application with no arguments
    @When("the user runs the application with no arguments")
    public void the_user_runs_the_application_with_no_arguments() {
        runApplication(null);
    }

    private void runApplication(String arguments) {
        try {
            CharacterCounter counter = new CharacterCounter();
            var result = counter.getCharacterListWithCount(arguments.split(" "));
            result.forEach(line -> output += line.toString() + "\n");
        } catch (Exception e) {
            output = "Error: " + e.getMessage();
        }
    }

    @Then("the output should contain {int} vowels and {int} consonants")
    public void the_user_should_see_the_output(int vowels, int consonants) {
        String expectedOutput = String.format("vowelCount=%d, consonantCount=%d", vowels, consonants);
        assert output.contains(expectedOutput) : "Expected: " + expectedOutput + " but got: " + output;
    }

    @Then("the output should not contain an error")
    public void the_output_should_not_contain_an_error() {
        assert !output.contains("Error") : "Output contains an exception";
    }
    
    @Then("the output should contain an error")
    public void the_output_should_contain_an_error() {
        assert output.contains("Error") : "Output does not contain an exception";
    }

}
