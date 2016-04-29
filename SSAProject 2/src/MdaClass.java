


public class MdaClass {
	
	private State[] states = new State[8] ; 
	
	private State currentState;
	

	public MdaClass(AbstractFactory factory, DataStore dataStore)
	{   
	
		
		states[0] = new ActivateState(factory,dataStore);
		states[1] = new State0(factory,dataStore);
		states[2] = new State1(factory,dataStore);
		states[3] = new State2(factory,dataStore);
		states[4] = new State3(factory,dataStore);
		states[5] = new State4(factory,dataStore);
		states[6] = new State5(factory,dataStore);
		states[7] = new State6(factory,dataStore);
		
		currentState = states[0];
		
	}
	
	public void activate(AbstractFactory factory, DataStore dataStore)
	{
		
		if(currentState.getStateId() == 0)
		{
			currentState.activate(factory,dataStore);
             currentState = states[1];
		}
	}
	
    public void start(AbstractFactory factory, DataStore dataStore)
    {
    	
    	if(currentState.getStateId() == 1)
    	{
    		currentState.start(factory,dataStore);
    		currentState = states[2];
    	}
    }
    public void payCredit(AbstractFactory factory, DataStore dataStore)
    {   
    	
    	if(currentState.getStateId() == 2)
    	{  
    		currentState.payCredit(factory,dataStore);
    		currentState = states[3];
    	}
    }
    
    public void payCash(AbstractFactory factory, DataStore dataStore)
    {
    	
    	if(currentState.getStateId() == 2)
    	{
    		currentState.payCash(factory,dataStore);
    		currentState = states[4];
    	}
    }
    public void reject(AbstractFactory factory, DataStore dataStore)
    {
    
    	if(currentState.getStateId() ==3 )
    	{   
    		currentState.reject(factory,dataStore);
    		currentState = states[1];
    	}
    	
    }
    public void cancel(AbstractFactory factory, DataStore dataStore)
    {
    	
    	if(currentState.getStateId() == 4)
    	{   
    		currentState.cancel();
    		currentState = states[1];
    	}
    }
    public void approved(AbstractFactory factory, DataStore dataStore)
    {
    	
    	if(currentState.getStateId() == 3)
    	{
    		currentState.approved(factory,dataStore);
    		currentState = states[4];
    	}
    }
    public void startPump(AbstractFactory factory, DataStore dataStore)
    {
  
    	if(currentState.getStateId() == 5)
    	{
    	  	currentState.startPump(factory,dataStore);
    		currentState = states[6];
    	}
    	
    }
    public void pump(AbstractFactory factory, DataStore dataStore)
    {
    
    	if(currentState.getStateId() == 6)
    	{   
    		currentState.pump(factory,dataStore);
    		currentState = states[6];
    	}
    }
    public void stopPump(AbstractFactory factory, DataStore dataStore)
    {
 
    	if(currentState.getStateId() == 6)
    	{
    	   	currentState.stopPump(factory,dataStore);
    		currentState = states[7];
    	}
    }
    public void selectGas(int g,AbstractFactory factory, DataStore dataStore)
    {
    	
    	if(currentState.getStateId() == 4)
    	{
    		currentState.selectGas(g,factory,dataStore);
    		currentState = states[5];
    	}
    }
    public void receipt(AbstractFactory factory, DataStore dataStore)
    {
  
    	if(currentState.getStateId() == 7)
    	{
    	  	currentState.receipt(factory,dataStore);
    		currentState = states[1];
    	}
    }
    public void noReceipt(AbstractFactory factory, DataStore dataStore)
    {
    
    	if(currentState.getStateId() == 7)
    	{
    		currentState.noReceipt();
    		currentState = states[1];
    	}
    }
}
