
public class GasPump3Factory extends AbstractFactory {
	
	DataStore dataStore = new DataStoreGP3();
	
	
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
	    return  new StoreDataGasPump3();
	}
	
	public PayMessageAbstract getPayMessage()
	{
		return new PayMessage3();
	}
	
	public StoreCashAbstract getStoreCash()
	{
		 return new StoreCashGasPump3();
	}
	
	public DisplayMenuAbstract getDisplayMenu()
	{
		return new  DisplayMenuGasPump3();
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
		return new SetPrice3();
	}
	
	public ReadyMessageAbstract getReadyMessage()
	{
		return new ReadyMessage1();
	}
	
	public SetInitialValueAbstract getSetInitialValue()
	{
		return new SetInitial3();
	}
  public PumpGasUnitAbstarct getPumpGasUnit()
  {
	    return new PumpGasUnit3();
  }
  
  public GasPumpedMessageAbstract getGasPumpedMessage()
  {
	 return new GasPumpedMessage2();
  }
  
  public StopMessageAbstract getStopMessage()
  {
	  return new StopMessage1();
  }
  
  public PrintReceiptAbstract getPrintReceipt()
  {
	  return new PrintReceipt3();
  }
  public CancelMessageAbstract getCancelMessage()
  {
	   return new CancelMessage1();
  }



}
