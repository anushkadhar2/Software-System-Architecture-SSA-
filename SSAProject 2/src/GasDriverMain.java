//import java.util.InputMismatchException;
import java.util.Scanner;


public class GasDriverMain {

	
	public static void main(String []args)
	{
			GasDriverMain gasDriver = new GasDriverMain();
			gasDriver.displayOptions();
	}


	public void displayOptions()
{
	    		Scanner input = new Scanner(System.in);
	    	 
	    	
	    		System.out.println("Welcome to the Gas Station");
	    		System.out.println("1. Gas-Pump -1");
	    		System.out.println("2. Gas-Pump -2");
	    		System.out.println("3. Gas-Pump -3");
	    		System.out.println("4. Exit");
  	
	    		System.out.println("\n");
	    	
	    		System.out.println("Select option(1-3): ");
	    	
	    		int   option = input.nextInt();
	    		 
	     switch(option)
	    		{
	    			case 1 :
	    		
	    	{  
	    		
	    		DataStoreGP1 ds1 = new DataStoreGP1(); //creating object of datastore1
	    		GasPump1Factory factory = new GasPump1Factory(); //creating object of factory1
		    	GPOutputProcessor op = new GPOutputProcessor(factory,factory.GetDataStore()); // creating object of gas processor
		    	MdaClass md = new MdaClass(factory,ds1); // creating object of mda class
		    	GasPump1 gp1 = new GasPump1(md,ds1,factory); // creating object of gas pump1 class

	    	    System.out.println("Gas Pump Execution 1");
	    	    
	    	    String ch ="1";
	    	    while(ch!= "q")
	    	    {
	    		   System.out.println("Select option");
	    	   
	    		   System.out.println("0- Activate ,1-Start ,2-PayCredit,3-Reject,4-Cancel, 5-Approved,6-PayCash,7-StartPump,8-PumpGallon,9-StopPump,q-quit");
	    	   
	    		   ch = input.next();
	    	   
	    		   if(ch.equalsIgnoreCase("0"))
	    		   {
	    	       System.out.println("Operation Activate (int a) ");
	    	       System.out.println("Enter the a ");
	    	       int a = input.nextInt();
	    	   
	    	       gp1.activate(a);
	    		   }
	    		   else if(ch.equalsIgnoreCase("1"))
	    		   {
	    	    	gp1.start();
	    		   }
	    		   else if(ch.equalsIgnoreCase("2"))
	    		   {
	    	    		gp1.payCredit();
	    		   }
	    		   else if(ch.equalsIgnoreCase("3"))
	    		   {
	    	    	
	    	    	gp1.reject();
	    		   }
	    		   else if(ch.equalsIgnoreCase("4"))
	    		   {
	    			  
	    			   gp1.cancel();
	    		   }
	    		   else if(ch.equalsIgnoreCase("5"))
	    		   {
	    			   
	    			   gp1.approved();
	    		   }
	    		   else if(ch.equalsIgnoreCase("6"))
	    		   {
	    	    	System.out.println("Enter the value of c ");
	    	    	int c = input.nextInt();
	    	    	
	    	    	gp1.payCash(c);
	    		   }
	    		   else if(ch.equalsIgnoreCase("7"))
	    		   {
	    	    	
	    	    	gp1.startPump();
	    		   }
	    		   else if(ch.equalsIgnoreCase("8"))
	    		   {
	    	    	
	    	    	gp1.pumpGallon();
	    		   }
	    		   else if(ch.equalsIgnoreCase("9"))
	    		   {
	    	    	
	    	    	gp1.stopPump();
	    		   }
	    		  
	    	    	}
	    	    break;
	    	}
	    	case 2 :
	    		
	    		{  
	    			DataStoreGP2 ds2 = new DataStoreGP2();  // creating object of datastore 2
	    			GasPump2Factory factory = new GasPump2Factory(); //creating object for facoty 2
			    	GPOutputProcessor op = new GPOutputProcessor(factory,factory.GetDataStore()); //creating object for output processor
			    	MdaClass md = new MdaClass(factory,ds2);   // creating mda class object 
			    	GasPump2 gp2 = new GasPump2(md,ds2,factory); //creating gp 2 object
			    	
	    	    System.out.println("Gas Pump Execution 2");
	    	    
	    	    String ch ="1";
	    	    while(ch!= "q")
	    	    {
	    		   System.out.println("Select option");
	    	   
	    		   System.out.println("0- Activate,1-Start,2-PayCredit,3-Reject,4-Cancel, 5-Approved,6-Super,7-Regular,8-StartPump,9-PumpGallon,10-StopPump,q-quit");
	    	   
	    		   ch = input.next();
	    	   
	    		   if(ch.equalsIgnoreCase("0"))
	    		   {
	    	     
	    	       System.out.println("Enter the value of a \n");
	    	       float a = input.nextFloat();
	    	       System.out.println("Enter the value of b \n");
	    	       
	    	       float b = input.nextFloat();
	    	       gp2.activate(a, b);
	    		   }
	    		   else if(ch.equalsIgnoreCase("1"))
	    		   {
	    	    	
	    	    	gp2.start();
	    		   }
	    		   else if(ch.equalsIgnoreCase("2"))
	    		   {
	    	    	
	    	    	gp2.payCredit();
	    		   }
	    		   else if(ch.equalsIgnoreCase("3"))
	    		   {
	    	    	
	    	    	gp2.reject();
	    		   }
	    		   else if(ch.equalsIgnoreCase("5"))
	    		   {
	    			   
	    			   gp2.approved();
	    		   }
	    		   else if(ch.equalsIgnoreCase("6"))
	    		   {
	    	    	
	    	    	gp2.Super();
	    		   }
	    		   else if(ch.equalsIgnoreCase("7"))
	    		   {
	    	    	
	    	    	gp2.regular();
	    		   }
	    		   else if(ch.equalsIgnoreCase("8"))
	    		   {
	    	    	
	    	    	gp2.startPump();
	    		   }
	    		   else if(ch.equalsIgnoreCase("9"))
	    		   {
	    	    	
	    	    	gp2.pumpGallon();
	    		   }
	    		   else if(ch.equalsIgnoreCase("10"))
	    		   {
	    	    	
	    	    	gp2.stopPump();
	    		   }
	    		   
	    		 
	    	    }
	    	    break;
	    	}
	    	case 3 :
	    	{  
	    		DataStoreGP3 ds3 = new DataStoreGP3();
	    		GasPump3Factory factory = new GasPump3Factory();
		    	GPOutputProcessor op = new GPOutputProcessor(factory,factory.GetDataStore());
		    	MdaClass md = new MdaClass(factory,ds3);
		    	GasPump3 gp3 = new GasPump3(md,ds3,factory);
	    		
	    	    System.out.println("Gas Pump Execution 3");
	    	    
	    	    String ch ="1";
	    	    while(ch!= "q")
	    	    {
	    		   System.out.println("Select option");
	    	   
	    		   System.out.println("0- Activate,1-Start,2-PayCash,3-Cancel,4-Premium, 5-Regular,6-StartPump,7-PumpLitre,8-StopPump,9-Receipt,10-NoReceipt,q-quit");
	    	   
	    		   ch = input.next();
	    	   
	    		   if(ch.equalsIgnoreCase("0"))
	    		   {
	    			   
	    			   System.out.println("Enter the value of a \n");
	    			   
	    			   float a = input.nextFloat();
	    			   
	    			   System.out.println("Enter the value of b \n");
	    	      
	    			   float b = input.nextFloat();
	    	       
	    			   gp3.activate(a, b);
	    		   }
	    		   else if(ch.equalsIgnoreCase("1"))
	    		   {
	    			   
	    			   gp3.start();
	    		   }
	    		   else if(ch.equalsIgnoreCase("2"))
	    		   {
	    			   
	    			   System.out.println("Enter the value of c \n");
	    	    	
	    			   int c = input.nextInt(); 
	    	    	
	    			   gp3.payCash(c);
	    		   }
	    		   else if(ch.equalsIgnoreCase("3"))
	    		   {
	    	    	
	    	    	
	    			   gp3.cancel();
	    		   }
	    		   else if(ch.equalsIgnoreCase("4"))
	    		   {
	    			   gp3.premium();
	    		   }
	    		   else if(ch.equalsIgnoreCase("5"))
	    		   {
	    	    	
	    			   gp3.regular();
	    		   }
	    		   else if(ch.equalsIgnoreCase("6"))
	    		   {
	    	    	
	    			   gp3.startPump();
	    		   }
	    		   else if(ch.equalsIgnoreCase("7"))
	    		   {
	    	    	
	    			   gp3.pumpLitre();
	    		   }
	    		   else if(ch.equalsIgnoreCase("8"))
	    		   {
	    	    	
	    			   gp3.stopPump();
	    		   }
	    		   else if(ch.equalsIgnoreCase("9"))
	    		   {
	    	    	
	    			   
	    			   gp3.Receipt();
	    	    	
	    		   }
	    		   else if(ch.equalsIgnoreCase("10"))
	    		   {
	    	    	
	    			   System.out.println("NoReceipt");
	    	    	
	    			   gp3.noReceipt();
	    	    	
	    		   }
	    		 
	    	    }
	    		 
	    	    break;
	    	}
	    	case 4 :
	    	{
	    		System.out.println("Exiting the system Thank You");
	    		break;
	    	}
	    	
	    default :
	    	{
	    		System.out.println("Invalid Input");
	    		break;
	    	}
	    }
}
}
