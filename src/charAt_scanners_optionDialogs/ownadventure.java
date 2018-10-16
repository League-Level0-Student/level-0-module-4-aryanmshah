package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ownadventure {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "You have found 2 treasure chests ");
	String x=JOptionPane.showInputDialog("Type left or right one will contain the treasure and the other will contain a killer snake");
	
	if(x.equals("right")) {
		JOptionPane.showMessageDialog(null, "Congrats u found the treasure!!!!!!!!!!! ");
		
	}
	else {}
	
	
	if(x.equals("left")) {
		JOptionPane.showMessageDialog(null, "LOLOLOL u died!!!!!!! ");
		
	}
	else {}
}
}
