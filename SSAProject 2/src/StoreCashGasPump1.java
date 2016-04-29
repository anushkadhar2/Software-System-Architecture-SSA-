
public class StoreCashGasPump1 extends StoreCashAbstract{
	
	  public void StoreCash(DataStore dataStore)
	  {
		  ((DataStoreGP1) dataStore).setCash(((DataStoreGP1) dataStore).getCash());
		  System.out.println("Cash value is set");
	  }

}
