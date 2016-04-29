
public class PumpGasUnit1 extends PumpGasUnitAbstarct{
	
	  public void PumpGasUnit(DataStore dataStore) {
		  
		  
		  System.out.println("THE AMOUNT OF GAS YOU REQUESTED");
		//  if ( (((DataStoreGP1) dataStore).getW()==1||(((DataStoreGP1) dataStore).getW()==0)) && (((DataStoreGP1) dataStore).getCash() >= ((DataStoreGP1) dataStore).getPrice()*(dataStore.getGas()+1)))
		  //{
			    dataStore.setGas(dataStore.getGas()+1)  ;
			    ((DataStoreGP1) dataStore).setTotal(((DataStoreGP1) dataStore).getPrice()*dataStore.getGas());
		  //}
	}

}


