
public class State3 extends State{
	
	//extra added
	 public State3(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(4);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	 }  
	public void cancel(AbstractFactory factory, DataStore dataStore)
	{
		gpOut.cancelMsg();

	}
	
	public void selectGas(int g, AbstractFactory factory, DataStore  dataStore)
	{
		gpOut.setPrice(g);
	
	}

}
