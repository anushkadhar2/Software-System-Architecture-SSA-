
public class PumpGasUnit2 extends PumpGasUnitAbstarct{
	
	  public void PumpGasUnit(DataStore dataStore) {
		// TODO Auto-generated method stub
		  System.out.println("AMOUNT OF GAS YOU REQUESTED");
		  
		  dataStore.setGas(dataStore.getGas()+1);
		  ((DataStoreGP2) dataStore).setTotal(((DataStoreGP2) dataStore).getPrice()*dataStore.getGas());
		  
	}

}
