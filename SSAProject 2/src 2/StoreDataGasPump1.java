
public class StoreDataGasPump1 extends StoreDataAbstract{

	
	   public  void StoreData(DataStore dataStore)
	   {  
		   
		   ((DataStoreGP1) dataStore).setPrice(((DataStoreGP1) dataStore).getA());
		 
	   }
}
