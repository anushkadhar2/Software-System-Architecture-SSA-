
public class GPOutputProcessor {
   
	AbstractFactory factory = null;
	DataStore dataStore = null;
	

	 public GPOutputProcessor(AbstractFactory factory,DataStore dataStore) 
	{
        this.factory = factory;
        this.dataStore = dataStore;
    }


	
	private StoreDataAbstract storeData;
	private StoreCashAbstract storeCash;
	private StopMessageAbstract stopMsg;
	private SetWAbstract setW;
	private SetPriceAbstract setPrice;
	private SetInitialValueAbstract initialValue;
	private RejectMessageAbstract rejectMsg;
	private ReadyMessageAbstract readyMsg;
	private PumpGasUnitAbstarct pumpUnit;
	private PrintReceiptAbstract printReceipt;
    private PayMessageAbstract payMsg;
    private GasPumpedMessageAbstract pumpedMsg;
    private DisplayMenuAbstract showMenu;
    private CancelMessageAbstract cancelMsg;
    
    

	public void storeData(DataStore dataStore)
	{   
		storeData = factory.getStoreData();
		storeData.StoreData(dataStore );
	}
	
	public void payMsg()
	{   
		payMsg = factory.getPayMessage();
		payMsg.PayMessage();
	}
	public void  storeCash()
	{   storeCash = factory.getStoreCash();
		storeCash.StoreCash(dataStore);
	}
	public void displayMenu()
	{
		showMenu = factory.getDisplayMenu();
		showMenu.DisplayMenu();
	}
	public void rejectMsg()
	{
		
		rejectMsg = factory.getRejectMessage();
		rejectMsg.RejectMessage();
	}
	public void setW(int w)
	{   
		setW = factory.getSetW();
        setW.SetW(w, dataStore);
	}
	
	public void setPrice(int g)
	{
		setPrice = factory.getSetPrice();
		setPrice.SetPrice(g,dataStore);
	}
	public void readyMsg()
	{
		readyMsg = factory.getReadyMessage();
		readyMsg.ReadyMessage();
	}
	public void setInitialValues(DataStore dataStore)
	{
		initialValue = factory.getSetInitialValue();
		initialValue.SetInitial(dataStore);
	}
	public void pumpGasUnit(DataStore dataStore)
	{   
		pumpUnit = factory.getPumpGasUnit();
		pumpUnit.PumpGasUnit(dataStore);
	}
	public void gasPumpedMsg(DataStore dataStore)
	{
		pumpedMsg = factory.getGasPumpedMessage();
		pumpedMsg.GasPumpedMessage(dataStore);
	}
	public void stopMsg(DataStore dataStore)
	{   
		stopMsg = factory.getStopMessage();
		stopMsg.StopMessage(dataStore);
	}
	public void printReceipt(DataStore dataStore)
	{   
		printReceipt = factory.getPrintReceipt();
		printReceipt.PrintReceipt(dataStore);
	}
	public void cancelMsg()
	{   
		cancelMsg = factory.getCancelMessage();
		cancelMsg.CancelMessage();
	}
}
