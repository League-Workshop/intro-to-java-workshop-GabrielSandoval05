package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		
		// 2.  Ask the user a question 
		String question= JOptionPane.showInputDialog("What planet other than saturn has rings?");
		
		// 3.  Use an if statement to check if their answer is correct
		if(question.equalsIgnoreCase("Uranus")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
			else {
				JOptionPane.showMessageDialog(null, "incorrect");
			}
		
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		score ++;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		if
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}

}


