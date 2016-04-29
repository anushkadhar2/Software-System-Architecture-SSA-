
public class PumpGasUnit3 extends PumpGasUnitAbstarct{
	
	  public void PumpGasUnit(DataStore  dataStore) {
		// TODO Auto-generated method stub
		  System.out.println("THE AMOUNT OF GAS YOU REQUESTED ");
		  
		  dataStore.setL(dataStore.getL()+1);
		  
		//  dataStore.setGas(dataStore.getGas()+1);
		  
		  ((DataStoreGP3) dataStore).setTotal(((DataStoreGP3) dataStore).getPrice()*dataStore.getL());
		  //((DataStoreGP3) dataStore).setTotal(((DataStoreGP3) dataStore).getPrice()*(dataStore.getL()));
	}

}
