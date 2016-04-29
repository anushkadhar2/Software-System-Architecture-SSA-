
public class SetPrice3  extends SetPriceAbstract{
	
	public void SetPrice(int g,DataStore dataStore) {
		
	
		
		if(g == 1)
		{
		    ((DataStoreGP3) dataStore).setPrice(((DataStoreGP3) dataStore).getRPrice());
		}
		else if(g==2)
		{
			((DataStoreGP3) dataStore).setPrice(((DataStoreGP3) dataStore).getPprice());
		}
	}

}
