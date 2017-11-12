
public class PRSApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Purchase Request System");
		System.out.println();
		displayMainMenu();
		int menuOption = Console.getInt("Option selected: ", 0, 4);
		System.out.println();
		if (menuOption == 1) {
			createUser();
//		} else if (menuOption == 2) {
//			createProduct();
//		} else if (menuOption == 3) {
//			createVendor();
		}
		
		
		
		Console.printToConsole("Bye");

	}
	
	
	
	public static void displayMainMenu() {
		String str
			= "+++++++++++++++++++++++++++++++++++++++++++++++\n"
			+ "+++++++++++++++++ Main Menu +++++++++++++++++++\n" 
			+ "+++++++++++++++++++++++++++++++++++++++++++++++\n"
			+ "Please choose an option from the following menu\n\n"
			+ "1. Create User\n" 
			+ "2. Create Product\n" 
			+ "3. Create Vendor\n"
			+ "-----------------------------------------------\n";
		System.out.println(str);
	}
	
	public static void createUser() {
		String choice = "n";
		while (choice.equalsIgnoreCase("n")) {
			
			String uName = Console.getString("Enter user name:\t\t", 20);
			String pass = Console.getString("Enter password:\t\t", 4, 10);
			String fName = Console.getString("Enter first name:\t", 20);
			String lName = Console.getString("Enter last name:\t\t", 20);
			String phone = Console.getString("Enter phone:\t\t", 12);
			String email = Console.getString("Enter email:\t\t", 75);
			Boolean reviewer = Console.getBoolean("Reviewer? (T/F):\t\t");
			Boolean admin = Console.getBoolean("Admin? (T/F):\t\t");
			System.out.println();

			User user = new User(uName, pass, fName, lName, phone, email, reviewer, admin);
			
			Console.printToConsole(user.displayUser());
			
			choice = Console.getString("Submit? (y/n): ", "y", "n");
			System.out.println();
		}
	}
}
