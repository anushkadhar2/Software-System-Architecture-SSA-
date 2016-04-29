
public class StoreDataGasPump2 extends StoreDataAbstract{

	
	   public  void StoreData(DataStore dataStore)
	   {
		   ((DataStoreGP2) dataStore).setRPrice(((DataStoreGP2) dataStore).getA());
	
		   ((DataStoreGP2) dataStore).setSprice(((DataStoreGP2) dataStore).getB());
		
		   
	   }
}

