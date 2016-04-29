
public class StoreCashGasPump3 extends StoreCashAbstract{
	
	 
		  public void StoreCash(DataStore dataStore)
		  {
			  ((DataStoreGP3) dataStore).setCash(((DataStoreGP3) dataStore).getCash());
			  System.out.println("Cash value is set");
		  }

	  

}
