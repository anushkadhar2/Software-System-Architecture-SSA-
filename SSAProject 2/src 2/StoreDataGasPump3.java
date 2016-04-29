
public class StoreDataGasPump3 extends StoreDataAbstract{

	   public  void StoreData(DataStore dataStore)
	   {       
		      
		   ((DataStoreGP3) dataStore).setRPrice(((DataStoreGP3) dataStore).getA());
		   
		 
		   
		   ((DataStoreGP3) dataStore).setPprice(((DataStoreGP3) dataStore).getB());
	
		   
	   }
}
