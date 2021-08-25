package Maths;

public class Maths {
	public void addition(double num1, double num2) {
		System.out.println("The answer is " +(num1+num2));
	}

	public void multiply(double num1, double num2) {
		System.out.println("The answer is " +(num1*num2));
	}

	public void subtract(double num1, double num2) {
		System.out.println("The answer is " +(num1-num2));
	}
	
	public void divide(double num1, double num2) {
		if (num1>num2) {
			System.out.println("Cannot divide as answer is more than 1! Please try again.");
        } else {
            System.out.println("The answer is " +(num1/num2));
		}
	}

}
