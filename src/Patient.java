import java.util.*;
import java.util.UUID;
public class Patient
{   
  static int a;
  String s2="";
  void welcome()
  {
  System.out.println("WELCOME");
  }
  void login()
  {
	 	  if(a==1)
	  {
		    UUID idOne = UUID.randomUUID();
		    String s1=idOne.toString();
		    s2=s1.substring(0,6);
		    System.out.println("Patient id : "+s2);
	  }
	 	  else
	 	  {
	 		System.out.println("Enter your 6 digit patient id."); 
	 		Scanner in =new Scanner(System.in);
	 		String s3 = in.nextLine();
	 		System.out.println("Your id is : "+s3);
	 	  }
  }
  
  public static void main(String[] args) {
	  System.out.println("If you are a new patient press 1 else 0.");
	  Scanner in =new Scanner(System.in);
	   a=in.nextInt();
	   Patient ob = new Patient();
	   ob.welcome();
	   ob.login();
}
  
}
