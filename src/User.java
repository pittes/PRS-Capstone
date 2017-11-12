
public class User {

	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private boolean reviewer;
	private boolean admin;
	
	public User() {
		userName = "";
		password = "";
		firstName = "";
		lastName = "";
		phoneNumber = "";
		email = "";
		reviewer = false;
		admin = false;
		
	}
	
	public User(String un, String pw, String fn, String ln, String pn, String e, boolean m, boolean a) {
		setUserName(un);		//userName = un;
		setPassword(pw);		//password = pw;
		setFirstName(fn);
		setLastName(ln);
		setPhoneNumber(pn);
		setEmail(e); 		//email = e; //if argument above were name 'email', this.email = email;
		setReviewer(m);
		setAdmin(a);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isReviewer() {
		return reviewer;
	}

	public void setReviewer(boolean reviewer) {
		this.reviewer = reviewer;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String displayUser() {
		String str
			= "++++++++++++++++++++++++++++++++++++++++++++\n"
			+ "++++ USER PROFILE ++++++++++++++++++++++++++\n" 
			+ "++++++++++++++++++++++++++++++++++++++++++++\n"
			+ "Username:\t" + userName + "\n"
			+ "Name:\t\t" + firstName + " " + lastName + "\n" 
			+ "Phone Number:\t" + phoneNumber + "\n" 
			+ "Email Address:\t" + email +"\n"
			+ "Reviewer:\t" + reviewer + "\n"
			+ "Admin:\t\t" + admin + "\n"
			+ "--------------------------------------------\n";
		return str;
	}
	
}
