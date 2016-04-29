
public class PrintReceipt3 extends PrintReceiptAbstract {
	
	 public void PrintReceipt(DataStore dataStore) {
		// TODO Auto-generated method stub
		 
		System.out.println("Your bill is " +((DataStoreGP3) dataStore).getTotal());
		System.out.println("The gas pumped in litres is " +dataStore.getL());
		
	

}
}