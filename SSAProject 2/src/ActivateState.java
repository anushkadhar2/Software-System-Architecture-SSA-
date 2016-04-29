
public class ActivateState extends State {
	 
	 public ActivateState(AbstractFactory factory, DataStore dataStore) 
	    {  
		   
		    setStateId(0);
		    if(gpOut == null)
	        this.gpOut = new  GPOutputProcessor(factory, dataStore);
	 
	 }  
	 
		public void activate(AbstractFactory factory, DataStore dataStore)
		{  
			
			gpOut.storeData( dataStore);

		
		}

	}
