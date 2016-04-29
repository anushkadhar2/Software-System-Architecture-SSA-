
public abstract  class AbstractFactory {
	

			public abstract StoreDataAbstract getStoreData();
	
			public abstract PayMessageAbstract getPayMessage();
	
			public abstract StoreCashAbstract getStoreCash();
	
			public abstract DisplayMenuAbstract getDisplayMenu();

			public abstract RejectMessageAbstract getRejectMessage();
	
			public abstract SetWAbstract getSetW();
	
			public abstract SetPriceAbstract getSetPrice();
	
			public abstract  ReadyMessageAbstract getReadyMessage();
	
			public abstract SetInitialValueAbstract getSetInitialValue();
	
			public abstract   PumpGasUnitAbstarct getPumpGasUnit();

			public abstract GasPumpedMessageAbstract getGasPumpedMessage();
		
			public abstract StopMessageAbstract getStopMessage();

			public abstract PrintReceiptAbstract getPrintReceipt();
 
			public abstract CancelMessageAbstract getCancelMessage();


}
