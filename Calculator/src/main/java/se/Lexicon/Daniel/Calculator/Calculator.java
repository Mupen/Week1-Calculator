package se.Lexicon.Daniel.Calculator;

import java.util.Scanner;

/**
 * 
* This is a calculator that i made the first week.
* @author Daniel Henriksen.
* 
*/
// test 
public class Calculator {
    public static void main(String[] args) {
    	boolean quit = false;
    	displaySign(); 
        while(!quit) { // ! Called Logical NOT Operator. if quit is true when it will stop as someone have asked to quit.
        	
            String givenAnswer1 = getInput("Enter 1st number: ");               
            String chooseOperator = getInput("Please choose between + - * /: ");
            String givenAnswer2 = getInput("Enter the 2nd number: ");
            
            calculateInput(givenAnswer1, givenAnswer2, chooseOperator); // initialize calculateInput() method with inputed values from user. 
        	
        	boolean yesQuit = playAgain(getInput("Do you want to quit program?: Y/N : "));
        	if (yesQuit) {quit = terminateProgram();} // 
        	else {quit = refreshingProgram();}
        }
    }
    
    public static void displaySign() {
        // Welcome sign print out. The first thing user's will see.
        System.out.println("###################################################");
        System.out.println("#### Welcome To the Calculator Beta for week 1 ####");
        System.out.println("###################################################");
        
    }
    
    public static double calculateInput(String givenAnswer1, String givenAnswer2, String chooseOperator) { // 
    	double result = 0; 
        switch (chooseOperator)  {
        	case "+": result = addMethod(givenAnswer1, givenAnswer2); break; // addMethod() give it 2 String arguments, givenAnswer1 AND givenAnswer2
			case "-": result = subMethod(givenAnswer1, givenAnswer2); break; // subMethod() give it 2 String arguments, givenAnswer1 AND givenAnswer2
			case "/": result = divMethod(givenAnswer1, givenAnswer2); break; // divMethod() give it 2 String arguments, givenAnswer1 AND givenAnswer2
			case "*": result = multiMethod(givenAnswer1, givenAnswer2); break; // multiMethod() give it 2 String arguments, givenAnswer1 AND givenAnswer2
			default: System.out.println("There is NO such operation! Please choose between the 4!");
        }
        System.out.println("this is the result: " + result);
		return result;
    }
    
    public static boolean terminateProgram() {	
		System.out.println("Terminate the program...");
    	boolean quit = true;
    	return quit; 
    }
    
    public static boolean refreshingProgram() {	
    	System.out.println("Refreshing the program...");
    	boolean quit = false;
    	return quit; 
    }
    
    public static boolean playAgain(String getInput) {	
        String upperCaseString = getInput.toUpperCase();
        switch(upperCaseString) {
        case "Y":
            return true; // If one want to quit
        default:
            return false; // If one want to continue
        }
    }
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
       
    }

    static double addMethod(String givenAnswer1, String givenAnswer2) {
        double doubleNumber1 = Double.parseDouble(givenAnswer1);
        double doubleNumber2 = Double.parseDouble(givenAnswer2);
        return doubleNumber1 + doubleNumber2;
    }
 

    static double subMethod(String givenAnswer1, String givenAnswer2) {
        double doubleNumber1 = Double.parseDouble(givenAnswer1);
        double doubleNumber2 = Double.parseDouble(givenAnswer2);
        return doubleNumber1 - doubleNumber2;
    }
 

    static double multiMethod(String givenAnswer1, String givenAnswer2) {
        double doubleNumber1 = Double.parseDouble(givenAnswer1);
        double doubleNumber2 = Double.parseDouble(givenAnswer2);
        return doubleNumber1 * doubleNumber2;
    }
 

    static double divMethod(String givenAnswer1, String givenAnswer2) {
        double doubleNumber1 = Double.parseDouble(givenAnswer1);
        double doubleNumber2 = Double.parseDouble(givenAnswer2);
        if(doubleNumber2 == 0) {return doubleNumber2 = 0.0;} 
        else {return doubleNumber1 / doubleNumber2;}
    }
}