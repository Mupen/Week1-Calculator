package se.Lexicon.Daniel.Calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
    @Test
    public void test_addition_method_epected_value() {
    	// assertEquals(String message, long expected, long actual)
    	String givenNumber1 = "10.0";
    	String givenNumber2 = "15.0";
    	double expected = 25.0;
    	Assert.assertEquals(expected, Calculator.addMethod(givenNumber1, givenNumber2), 0.0);
    	
    }

    @Test
    public void test_subtraction_method_epected_value() {
    	String givenNumber1 = "10.0";
    	String givenNumber2 = "15.0";
    	double expected = -5.0;
    	Assert.assertEquals(expected, Calculator.subMethod(givenNumber1, givenNumber2),0.0);
    }
    
    @Test
    public void test_multiplication_method_epected_value() {
    	String givenNumber1 = "10.7";
    	String givenNumber2 = "15.7";
    	double expected = 167.99;
    	Assert.assertEquals(expected, Calculator.multiMethod(givenNumber1, givenNumber2),0.1);
    }
    
    @Test
    public void test_division_method_epected_value() {
    	String givenNumber1 = "10.0";
    	String givenNumber2 = "15.0";
    	double expected = 0.66;
    	Assert.assertEquals(expected, Calculator.divMethod(givenNumber1, givenNumber2),0.1);
    }
    
    @Test
    public void test_division_cant_zero_method_epected_value() {
    	String givenNumber1 = "10.0";
    	String givenNumber2 = "0.0";
    	double expected = 0.0;
    	Assert.assertEquals(expected, Calculator.divMethod(givenNumber1, givenNumber2),0.1);
    }
    
    @Test
    public void test_playAgain_method_epected_value() {
    	String test = "y";
    	boolean expected = true;
    	Assert.assertEquals(expected, Calculator.playAgain(test));
    }
  
    @Test
    public void test_calculateInput_epected_value() {
    	String givenAnswer1 = "24.6";
    	String givenAnswer2 = "62.0";
    	String chooseOperator = "/";
    	double expected = 0.3967741935483871;
    	Assert.assertEquals(expected, Calculator.calculateInput(givenAnswer1, givenAnswer2, chooseOperator), 0.0);
    }
    
    @Test
    public void test_refreshingProgram_epected_value() {
    	boolean expected = false;
    	Assert.assertEquals(expected, Calculator.refreshingProgram());
    }
    
    @Test
    public void test_terminateProgram_epected_value() {
    	boolean expected = true;
    	Assert.assertEquals(expected, Calculator.terminateProgram());
    }
}