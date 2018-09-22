//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random Ran = new Random();
	int r= Ran.nextInt(3);
	// 3. Print out this variable
	System.out.println();
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Type in a yes or no question for the MAGIC EIGHT BALL!");
	// 5. If the random number is 0
	if(r==0) {
	JOptionPane.showMessageDialog(null, "Yes!");
	}
	
	// -- tell the user "Yes"

	// 6. If the random number is 1
	if(r==1)
	{
	JOptionPane.showMessageDialog(null, "No!");	
	}// -- tell the user "No"
	

	// 7. If the random number is 2
	if(r==2) {
	JOptionPane.showMessageDialog(null, "Mabye you should go ask google");	
	}
	
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
	if(r==3)
	{
	JOptionPane.showMessageDialog(null, "I have no answer, GO HOME ! (if your lily");	
	}// -- write your own answer
	}
	}

