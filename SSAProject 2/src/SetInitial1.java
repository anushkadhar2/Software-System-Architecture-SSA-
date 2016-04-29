
public class SetInitial1 extends SetInitialValueAbstract{

	
	public  void SetInitial(DataStore dataStore) {
	
		dataStore.setGas(0);
	
		((DataStoreGP1) dataStore).setTotal(0);
	
 
	}
}
