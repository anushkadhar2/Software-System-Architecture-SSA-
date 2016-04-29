
public abstract class State {
	
	
	GPOutputProcessor gpOut ;

	public GPOutputProcessor getGpOut() {
		return gpOut;
	}
	public void setGpOut(GPOutputProcessor gpOut) {
		this.gpOut = gpOut;
	}
	public MdaClass md ; 
	
	private int stateId;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public void activate(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void start(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void payCredit(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void reject(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void approved(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	
	public void cancel()
	{
		
	}
	public void payCash(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void selectGas(int g,AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void startPump(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void pump(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void stopPump(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void receipt(AbstractFactory factory, DataStore dataStore)
	{
		
	}
	public void noReceipt()
	{
		
	}
}
