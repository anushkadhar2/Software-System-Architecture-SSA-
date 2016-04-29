
public class GasPump3 {
	
	private DataStore ds3;
	private MdaClass md;
	private AbstractFactory factory;
	public GasPump3(MdaClass md, DataStore ds3, AbstractFactory factory)
	{
		this.ds3 = ds3;
		this.md = md;
		this.factory = factory;
	}
	
	public void activate(float a,float b)
	{
		 if((a > 0) && (b>0))
		 {   
		
			 ((DataStoreGP3) ds3).setA(a);
		
			 ((DataStoreGP3) ds3).setB(b);
			 
			
			 md.activate(factory,ds3);
		 }
		 else
		 {
			 System.out.println("Incorrect input");
		 }
	}
	
	public void start()
	{   
		
		md.start(factory,ds3);
	}
	
	public void payCash(int c)
	{
		if(c>0)
		{  
			
			((DataStoreGP3) ds3).setC(c);
			
			md.payCash(factory,ds3);
		}
			
	}
	
	public void cancel()
	{ 
		
		md.cancel(factory,ds3);
	}
	
	public void premium()
	{   
		
		md.selectGas(2,factory,ds3);
	}
	
	public void regular()
	{   
		
		md.selectGas(1,factory,ds3);
	}
	public void startPump()
	{  
		
		md.startPump(factory,ds3);
	}
	public void pumpLitre()
	{
		if(((DataStoreGP3) ds3).getCash() < (ds3.getL()+1)*((DataStoreGP3) ds3).getPrice())
		{   
			
			md.pump(factory,ds3);
			
			
		}
		else
		{  
			
		
			md.stopPump(factory,ds3);
			
		}
		
	}
	public void stopPump()
	{
		
		md.stopPump(factory,ds3);
	}
	
	public void Receipt()
	{  
		
		md.receipt(factory,ds3);
	}
	
	public void noReceipt()
	{  
		
		md.noReceipt(factory,ds3);
	}
}
   