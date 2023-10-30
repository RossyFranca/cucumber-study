package hellocucumber;

import functions.FizzBuzz;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private int number;
    private String answer;
    @Given("the user selected the number {int}")
    public void selectNumber(int number) {
        this.number = number;
    }

    @When("the user clicked the FizzBuzz button")
    public void fizzBuzz() {
        answer = FizzBuzz.render(number);
    }

    @Then("the program prints {word}")
    public void checkAnswer(String expected) {
        assertEquals(expected, answer);
    }

}
