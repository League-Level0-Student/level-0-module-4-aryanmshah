package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Testscores {
public static void main(String[] args) {
	
	String x=JOptionPane.showInputDialog("What did u get on the test");
    double a=Double.parseDouble(x);
	 
    
    if (a<=80) {
    	JOptionPane.showConfirmDialog(null, "u failed lolololol");
    }
    else {
    	JOptionPane.showConfirmDialog(null, "good job try hard!!!!!!!!!!!!!!");
    }
}
}
