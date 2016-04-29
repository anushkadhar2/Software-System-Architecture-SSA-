
public class State0 extends State {
	
	 
	 public State0(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(1);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	    }  


	 public void start(AbstractFactory factory, DataStore dataStore)
	  {
		 
		 System.out.println("In the State 0 \n");
		 
		 System.out.println("Now calling the pay  message \n");
		  gpOut.payMsg( );
	
		 
	  }


}
