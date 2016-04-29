
public class State1 extends State{
	
	 public State1(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(2);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	    }  
   
	public void payCredit(AbstractFactory factory, DataStore dataStore)
	{
		
	}
   
	 public void payCash(AbstractFactory factory, DataStore dataStore)
	 {
		 gpOut.storeData( dataStore);
		 gpOut.setW(0);
		 gpOut.displayMenu( );
		
	 }
	
	
}
