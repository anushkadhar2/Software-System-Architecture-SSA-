
public class PrintReceipt2 extends PrintReceiptAbstract {
	
	 public void PrintReceipt(DataStore dataStore) {
		// TODO Auto-generated method stub
		 
		System.out.println("Your bill is " +((DataStoreGP2) dataStore).getTotal());
		System.out.println("The gas pumped in litres is " +dataStore.getGas());
		
	

}
}