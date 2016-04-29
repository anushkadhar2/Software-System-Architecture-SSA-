
public class PrintReceipt1 extends PrintReceiptAbstract {
	
	 public void PrintReceipt(DataStore dataStore) {
		// TODO Auto-generated method stub
		 
		 System.out.println("Your bill is " + ((DataStoreGP1) dataStore).getTotal());
		
	
	 }
}

