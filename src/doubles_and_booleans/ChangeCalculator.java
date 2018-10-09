package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
              String x=JOptionPane.showInputDialog("How many nickels do u have?????");
		// Convert their answer to an int using Integer.parseInt();
                int a=Integer.parseInt(x);
		// Ask the user how many dimes they have, and convert their answer
                String y=JOptionPane.showInputDialog("How many dimes do u have?????");
                int b=Integer.parseInt(y);
		// Ask the user how many quarters they have, and convert their answer
                String z=JOptionPane.showInputDialog("How many quarter do u have?????");
                int c=Integer.parseInt(z);
		// Calculate how much money the user has and save it in a double variable 
                  Double money=a*0.05+b*0.10+c*0.25;
		// Tell the user how much money they have
JOptionPane.showConfirmDialog(null, money);
	}
}

