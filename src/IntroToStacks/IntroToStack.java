package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> buffalo = new Stack<Double>();
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i<100; i++) {
			Random r = new Random(); 
			buffalo.push(r.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String Snum1 = JOptionPane.showInputDialog("Insert a number from 0 to 100");
		String Snum2 = JOptionPane.showInputDialog("Instert a second number from 0 to 100");
		Double num1 = Double.parseDouble(Snum1);
		Double num2 = Double.parseDouble(Snum2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for(int i = 0; i<100; i++) {
			Double popnum = buffalo.pop();
			if(num1>num2) {
				if(popnum<num1 && popnum>num2) {
					System.out.println(popnum);
				}
			}
			else if (num2>num1) {
				if(popnum<num2 && popnum>num1) {
					System.out.println(popnum);
				}
			}
			
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
