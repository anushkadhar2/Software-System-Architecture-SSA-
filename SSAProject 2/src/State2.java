
public class State2 extends State {
	

	 public State2(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(3);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	 }  

  
	public void reject(AbstractFactory factory, DataStore dataStore)
	{
		gpOut.rejectMsg();

	}
	
	public void approved(AbstractFactory factory, DataStore dataStore)
	{
		gpOut.setW(1);
		gpOut.displayMenu();
	
	}
}
