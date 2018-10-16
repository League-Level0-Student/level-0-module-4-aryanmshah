package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
JOptionPane.showInputDialog("What pet do u want and what store should it be from");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
int task = JOptionPane.showOptionDialog(null, "What will u do to make ur pet happy", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet it", "groom it", "kick it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
           if(task==0) {
        	   pet();
        	   System.out.println(happinessLevel);
           }
           
           if(task==1) {
        	   groom();
        	   System.out.println(happinessLevel);
           }
           if(task==2) {
        	   kick();
        	   System.out.println(happinessLevel);
           }

           
           
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
                     //skip
	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void pet() {
		JOptionPane.showMessageDialog(null, "good ur pet is happier");
		 happinessLevel++;
	}
	static void groom() {
		JOptionPane.showMessageDialog(null, "good ur pet is cleaner");
		 happinessLevel++;
	}
	
	static void kick() {
		JOptionPane.showMessageDialog(null, "chill my homee");
		 happinessLevel--;
	}
}