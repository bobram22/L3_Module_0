import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class dinnerDecider {
	/*
	1. Dinner Decider
	Sometimes I can’t decide what I want to eat. 
	1. Make an ArrayList of available food. 
	2. Use a random number to select a type of food everytime I run your program. 
	3. Make it say “you should eat <random_food_type> tonight”.
	Write the program first in Blockly, then in Java.
	note: Blockly indexes start at 1, Java indexes start at 0.
*/
public static void main(String[] args) {
	ArrayList<String> food = new ArrayList<String>();
	Random rand = new Random();
	food.add("Tacos de Asada");
	food.add("Tacos de Adobada");
	food.add("Tacos de Tripa");
	food.add("Tacos de Buche");
	int num = rand.nextInt(food.size());
	JOptionPane.showMessageDialog(null, "You should eat " + food.get(num) );
}

}
