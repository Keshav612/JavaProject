import java.util.*;
public class Doctor 
{
	 int a=0;int a2=0;
	 int a3=0;
	 int a4=0,a5=0,a6=0,a7=0;
 void illness() 
 {
	 Scanner in = new Scanner(System.in);
	 System.out.println("If you have that illness press 1 else 0");
	 System.out.println("Do you have fever");
	 int a5= in.nextInt();
	 
     if(a5==1)
     {
    	 a6=1;
    	 a=1;
    	
     }
     if(a5==0)
     {
    	 a6=2;
    	 a=0;
    	 
     }
     
	 String ill="";
	 System.out.println("From how many days are you suffering from fever.");
	 int a9=in.nextInt();
	 System.out.println("What is the frequency or times you have fever in a day");
	 int a10=in.nextInt();
	 System.out.println("Are you having itching over your body or having rashes");
	 int a11=in.nextInt();
	 if(a11>1)
     {
    	System.out.println("Wrong input .enter only one or zero"); 
        a=in.nextInt();
     }
	 System.out.println("Are you having stomach fever");
	 int a12=in.nextInt();
	 System.out.println("What is your fever temperature in celcius.");
	 double a8=in.nextDouble();
	 System.out.println("Do you have chilling fever");
     int a=in.nextInt();
     if(a>1)
     {
    	System.out.println("Wrong input .enter only one or zero"); 
        a=in.nextInt();
     }
     System.out.println("Do you have headache");
     int a2=in.nextInt();
     if(a2>1)
     {
    	System.out.println("Wrong input .enter only one or zero"); 
        a2=in.nextInt();
     }
     System.out.println("Are you suffering from convulsions");
     int a3=in.nextInt();
     if(a3>1)
     {
    	System.out.println("Wrong input .enter only one or zero"); 
        a3=in.nextInt();
     }
     System.out.println("Do you have anaemia");
     int  a4=in.nextInt() ;
     if(a4>1)
     {
    	System.out.println("Wrong input .enter only one or zero"); 
        a4=in.nextInt();
     }
     System.out.println("Do you have anxiety");
     int  a7=in.nextInt() ;
     if(a7>1)
     {
    	System.out.println("Wrong input .enter only one or zero"); 
        a7=in.nextInt();
     }
     if(a==0 && a5==1 )
     {
    	 System.out.println("Chilling fever is type of fever so select fever as 1.");
     }
     if(a==1 && a5==0) {
    	 System.out.println("This type of fever is not in our database refer to doctor.");
     }
     if(a8>=38 && a8<=39)
     {
    	 System.out.println("You have low grade fever.");
     }
     if(a8>39 && a8<=40)
     {
    	 System.out.println("You have moderate fever.");
     }
     if(a8>40 && a8<=41)
     {
    	 System.out.println("You have high fever");
     }
     if(a8>41)
     {
    	 System.out.println("You have hyperpyrexia");
     }
    	 
	 switch(a6)
	 {
	 case 1:
		      
			    	  if(a==1 && a2==1 && a3==1 &&a4==1&&a7==1)
			    	  { 
			    		  System.out.println("You might have malaria .");
	    			      System.out.println("Conduct these test :");
	    			      System.out.println("Blood smear");
			    	  }
			    	  if(a==1 && a2==0 && a3==1 &&a4==1&& (a7==1||a7==0) )
			    	  { 
                        System.out.println("You may have Dengue hemorraghic fever (DHF)");
                        System.out.println("Conduct dengue test and then visit again");
			    	  }
			    	  if(a==1 && a2==0 && a3==0 &&a4==1&&(a7==1||a7==0))
			    	  { 
                        System.out.println("Remit Tent fever.");
			    	  }
		      
		      
			    	  if(a==1 && a2==0 && a3==0 &&a4==0&&(a7==1||a7==0) )
			    	  { 
                        System.out.println("You have a viral fever");
			    	  }
			    	  if(a==1 && a2==1 && a3==0 &&a4==1&&(a7==1||a7==0))
			    	  { 
                        System.out.println("You are suffering from febrile convulsions fever.");
			    	  }
			    	  if(a==1 && a2==1 && a3==0 &&a4==0&&(a7==1||a7==0))
			    	  { 
                        System.out.println("You may have brain fever.Consult doctor immidietly.");
			    	  }
			    	  if(a==1 && a2==0 && a3==1 &&a4==0&&(a7==1||a7==0))
			    	  { 
                        System.out.println("You may have malaria.");
                        System.out.println("Conduct malaria test and show the reports.");
			    	  }
			    	 
			    	  if(a==1 && a2==1 && a3==1 &&a4==0&&(a7==1||a7==0))
			    	  { 
                        System.out.println("You are having fever due to season change.");
                        System.out.println("Take these medicines:");
                        System.out.println("DOLO 600mg");
                        System.out.println("Becausul");
			    	  }	
			    	  if(a==1 && a2==0 && a3==1 &&a4==0&&a7==0)
			    	  { 
                        System.out.println("You may have Intermittent fever");
			    	  }
		      
		      break;
	 case 2:
	 
      if(a==0 && a2==0 && a3==1 && a4==0 && (a7==1||a7==0))
   	  { 
   		  System.out.println("you have low blood pressure");
   		 System.out.println("Consume lots of water.");
   		System.out.println("Drink beetroot juice");
   	  }
   	  if(a==0 && a2==0 && a3==1 &&a4==1&&(a7==1||a7==0))
   	  { 
           System.out.println("You may be suffering from Aplastic Anaemia.");
           System.out.println("Please refer to doctor as soon as possible");
   	  }
   	  if(a==0 && a2==0 && a3==0 &&a4==1 &&a7==1)
   	  { 
           System.out.println("There may be iron deficiency.");
           System.out.println("please conduct the test of haemoglobin");
   	  }
   	  if(a==0 && a2==1 && a3==0 &&a4==0 &&(a7==1||a7==0))
   	  { 
           System.out.println("You may have normal headache due to tension.Take rest.");
   	  }
   	  if(a==0 && a2==1 && a3==1 &&a4==1&&a7==1)
   	  { 
           System.out.println("You may have felty syndrome.Consult a specialist.");
   	  }
   	  if(a==0 && a2==1 && a3==1 &&a4==0&&a7==1)
   	  { 
           System.out.println("You are suffering from anxiety hypertension.");
   	  }
   	  if(a==0 && a2==1 && a3==0 &&a4==1&&(a7==1||a7==0))
   	  { 
           System.out.println("Conduct haemoglobin test ");
   	  }
   	 
   	  if(a==0 && a2==0 && a3==0 &&a4==1&&a7==0)
   	  { 
           System.out.println("You are suffering from anaemia");
   	  }
   	if(a==0 && a2==1 && a3==1 &&a4==1&&a7==0)
 	  { 
         System.out.println("You may have anaemia.Take a saridon for headache");
 	  }
   	if(a==0 && a2==1 && a3==1 &&a4==0&&a7==0)
 	  { 
   		System.out.println("You may have lot of stress.Take rest and free your mind");
 	  }
   	if(a==0 && a2==0 && a3==1 &&a4==1&&a7==1)
 	  { 
         System.out.println("You may have nerve disorder.Please visit specialist");
 	  }
   	if(a==0 && a2==0 && a3==0 &&a4==0&&a7==1)
 	  { 
         System.out.println("You may have little pressure on you.Not much to worry.");
 	  }
   	if(a==0 && a2==0 && a3==0 &&a4==0&&a7==0)
 	  { 
         System.out.println("You are fine");
 	  }
   	  break;
		 default:
			 System.out.println("You have entered wrong inputs other than 0 and 1.");
	 }
 }
 public static void main(String[] args) 
 {
	 Scanner in =new Scanner(System.in);
	 System.out.println("WELCOME");
	 Doctor ob = new Doctor();
	 
	 Patient obj = new Patient();
	 Patient.main(null);
	 

	  //object
	ob.illness();
}
}
/*
  System.out.println("Do you have chilling fever");
     
     int a=in.nextInt();
     System.out.println("Do you have headache");
     int a2=in.nextInt();
     System.out.println("Are you suffering from convulsions");
     int a3=in.nextInt();
	  System.out.println("Do you have anaemia");
	  int  a4=in.nextInt() ;
     
  
  
 * */
