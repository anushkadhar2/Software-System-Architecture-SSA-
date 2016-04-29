
public class GasPump1Factory extends AbstractFactory{
	
	DataStore dataStore = new DataStoreGP1();
	
	
	public DataStore CreateDataStore()
	{ 
		return dataStore;
	}
	public DataStore GetDataStore()
	{
		return dataStore;
	}
	
	public StoreDataAbstract getStoreData()
	{
	    return  new StoreDataGasPump1();
	}
	
	public PayMessageAbstract getPayMessage()
	{
		return new PayMessage1();
	}
	
	public StoreCashAbstract getStoreCash()
	{
		return new StoreCashGasPump1();
	}
	
	public DisplayMenuAbstract getDisplayMenu()
	{
		return new  DisplayMenuGasPump1();
	}
	
	public RejectMessageAbstract getRejectMessage()
	{
		 return new RejectMessage1();
	}
	
	public SetWAbstract getSetW()
	{
		return new SetW1();
	}
	public SetPriceAbstract getSetPrice()
	{
		return new SetPrice1();
	}
	
	public ReadyMessageAbstract getReadyMessage()
	{
		return new ReadyMessage1();
	}
	
	public SetInitialValueAbstract getSetInitialValue()
	{
		return new SetInitial1();
	}
  public PumpGasUnitAbstarct getPumpGasUnit()
  {
	    return new PumpGasUnit1();
  }
  
  public GasPumpedMessageAbstract getGasPumpedMessage()
  {
	 return new GasPumpedMessage1();
  }
  
  public StopMessageAbstract getStopMessage()
  {
	  return new StopMessage1();
  }
  
  public PrintReceiptAbstract getPrintReceipt()
  {
	  return new PrintReceipt1();
  }
  public CancelMessageAbstract getCancelMessage()
  {
	   return new CancelMessage1();
  }


}
