package email_app;
import java.util.Scanner;
public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private int passwordlength =10;
	private String department;
	private int mailboxcapacity;
	private String alternateemail;
	private String companySuffix = "pqrcomapny.com";
	
//	Constructor to receive the first and last name;
	public Email(String firstname, String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created : "+ this.firstname+" "+this.lastname);
		
		this.department = setDept();
		System.out.println("Department: "+this.department);
		
		this.password = randomPassword(passwordlength);
		System.out.println("Password is: "+this.password);
		
		//Combine elements to generate a email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your Email is : "+this.email);
		
	}
	
	//Ask for department
	private String setDept()
	{
		System.out.println("Dept Codes\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none");
		System.out.print("Enter your Department : ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice ==1) {return "Sales";}
		else if(depChoice ==2) {return "Development";}
		else if(depChoice ==3) {return "Accounting";}
		else {return " ";}
		
	}
	//Generate a random Password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234556";
		char [] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);	
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxcapacity = capacity;
	}
	
	//Set the alternative mail
	public void setAlternateEmail(String altEmail)
	{
		this.alternateemail = altEmail;
	}
	
	//Change the password
	public void changePassowrd(String password)
	{
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxcapacity;}
	public String getAlternateEmail() {return alternateemail;}
	public String getPassword() {return password; }
	
	public String showInfo()
	{
		return "Display Name:" + firstname + " " + lastname +
			    "\nCompany Email : " + email +
			    "\nMailbox Capacity : " + mailboxcapacity + "mb";
	}
}
