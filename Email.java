package emailapp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=10;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="DIL.com";
	
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		/*  System.out.println("Email created: "+this.firstName+" "+this.lastName);  */
		
	//call a method asking for department - return the department
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		
	// call a method that return a random password
		this.password = randomPassword(12);
		/*  System.out.println("Your password is: "+this.password);  */
		
	// combine element to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		/*  System.out.println("Your Email: "+email);  */
		
		
	}
	
	// ask for department
	private String setDepartment() {
		System.out.println("New worker:"+firstName+".DEPARTMENT CODE\n1 for sales\n2 for development\n3 for accounting\n0 for none\n Enter the department: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		}
		else if(depChoice == 2) {
			return "development";
		}
		else if(depChoice == 3) {
			return "accounting";
		}
		else{
			return "nothing";
		}	
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTVWXYZ1234567890*&^%$#@!~";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);			
	}
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//get method
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	
	// show method 
	public String showInfo() {
		return "DISPLAY NAME: "+firstName+lastName+
				"\nCOMPANY NAME: "+email+
				"\nMAILBOXCAPACITY: "+mailboxCapacity+"mb";
	}
	
	
	

}
