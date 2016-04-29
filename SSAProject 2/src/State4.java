public class State4 extends State{
	

public State4(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(5);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	 }  
 
			public void startPump(AbstractFactory   factory,  DataStore dataStore)
			{
				gpOut.setInitialValues( dataStore);
				gpOut.readyMsg();
			
			}
}
