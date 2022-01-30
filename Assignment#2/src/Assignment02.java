/* Student Name: Jennifer Tran
 * Lab Professor: Mohammed Patoary
 * Due Date: November 19,2021
 * Description: This is the main class that will calculate the drink size and volume for the user.

 */

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class Assignment02 {

	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public static void main(String[] args) {
		DrinkMachine machine = new DrinkMachine();
		User user = new User();
		// (other variables as needed)
		
		
		String anyMore = "no";
		
		do {
			System.out.println(machine.drinkSizeMenu());
			System.out.println("drink sizes are case-sensitive");
			String size = user.inputString("Enter size (small, medium or large) ");
			
			machine.setSize(size);
			
			double volume = user.inputDouble("Enter volume ");
			machine.setVolume(volume);
			
			System.out.println(machine.verifySize());
			
			System.out.println("Program by Jennifer Tran");
			
			anyMore = user.inputString("Continue program (yes/no)? ");
		
		}while (anyMore.equalsIgnoreCase("yes"));
		
		System.out.println("Program has exited.");
		
		// ToDo:
		// Ask for drink size as text, prompt using the menu generated (Done)
		// from a method in DrinkMachine (done)
		
		// Ask for measured volume, accepting decimal places (Done)
		
		// determine if the volume matches the expected size using the   (HELP)
		// verifySize() method, printing the returned report.
		
		// print out your name on screen (Done)
		
		// ask if there is more data to enter (yes, no) and continue (done)
		// using a loop only if the user enters some form of yes
		// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
		
		// you can use any decision structure or loop for this program,
		// however a for-loop is not recommended.
		
		

	}
}