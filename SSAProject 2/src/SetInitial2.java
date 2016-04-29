
public class SetInitial2 extends SetInitialValueAbstract{

	
	public  void SetInitial(DataStore dataStore) {
		  
		dataStore.setGas(0);
      //  dataStore.setL(0);
        ((DataStoreGP2) dataStore).setTotal(0);
        
		
	}
}