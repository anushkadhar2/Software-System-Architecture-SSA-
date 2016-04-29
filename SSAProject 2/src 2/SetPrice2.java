
public class SetPrice2  extends SetPriceAbstract{
	
	public void SetPrice(int g, DataStore dataStore) {
		
		
		if(g == 1)
		{
			((DataStoreGP2) dataStore).setPrice(((DataStoreGP2) dataStore).getRPrice());
		}
		else if(g == 2)
		{
			((DataStoreGP2) dataStore).setPrice(((DataStoreGP2) dataStore).getSprice());
		}
	}

}
