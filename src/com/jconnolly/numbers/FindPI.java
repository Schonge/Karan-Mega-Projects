package com.jconnolly.numbers;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 * Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places.
 * Keep a limit to how far the program will go.
 * @author jconnolly
 *
 */

public class FindPI {
	
	public static void main(String[] args) {
		new FindPI().createGUI();;
	}
	
	public void createGUI() {
		String ui = JOptionPane.showInputDialog("Enter a number between 1 and 15 to set the number of decimal values in PI:");
		String userInput = calculatePI(Integer.parseInt(ui));
		JOptionPane.showMessageDialog(null, "PI is " + userInput);
	}
	
	public String calculatePI(int digit) {
		
		if(digit > 0 && digit < 16) {
			BigDecimal userDigit = new BigDecimal(Math.PI).setScale(digit, BigDecimal.ROUND_DOWN);
			return userDigit.toString();
		} else {
			return "Invalid Number!";
		}
		
	}

}
