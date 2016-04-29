
public class GasPump2Factory extends AbstractFactory{
	
DataStore dataStore = new DataStoreGP2();
	
	
	public DataStore CreateDataStore()
	{
		return dataStore;
	}
	public DataStore GetDataStore()
	{
		return dataStore;
	}

	public  StoreDataAbstract getStoreData()
	{
	    return  new StoreDataGasPump2();
	}
	
	public PayMessageAbstract getPayMessage()
	{
		return new PayMessage2();
	}
	
	public StoreCashAbstract getStoreCash()
	{
		 return null;
	}
	
	public DisplayMenuAbstract getDisplayMenu()
	{
		return new  DisplayMenuGasPump2();
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
		return new SetPrice2();
	}
	
	public ReadyMessageAbstract getReadyMessage()
	{
		return new ReadyMessage1();
	}
	
	public SetInitialValueAbstract getSetInitialValue()
	{
		return new SetInitial2();
	}
  public PumpGasUnitAbstarct  getPumpGasUnit()
  {
	    return new PumpGasUnit2();
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
	  return new PrintReceipt2();
  }
  public CancelMessageAbstract getCancelMessage()
  {
	   return new CancelMessage1();
  }

}
