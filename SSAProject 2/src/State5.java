
public class State5 extends State {
	 public State5(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(6);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	 }  
	
	public void  pump(AbstractFactory factory, DataStore dataStore)
	{
	   gpOut.pumpGasUnit(dataStore);
	  gpOut.gasPumpedMsg(dataStore);
	
	}
    public void stopPump(AbstractFactory factory, DataStore dataStore)
    {
    	gpOut.stopMsg(dataStore);
    	
    }
}
