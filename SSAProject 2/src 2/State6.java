
public class State6 extends State{
	
	 public State6(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(7);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	 }   
 
  public void noReceipt(AbstractFactory factory, DataStore dataStore)
  {
	
  }
  
  public void receipt(AbstractFactory factory, DataStore dataStore)
  {
	  gpOut.printReceipt( dataStore);

  }
}
