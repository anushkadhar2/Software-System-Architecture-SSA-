


public class GasPump2 {
	
	private DataStore ds2;
	private MdaClass md;
	private AbstractFactory factory;
	
	public GasPump2(MdaClass md, DataStore ds2 ,AbstractFactory factory)
	{
		this.ds2 = ds2;
		this.md = md;
				this.factory = factory;
	}
	
	
	public void activate(float a , float b)
	{
		 if((a > 0)&&(b > 0))
		 {    
			
			 ((DataStoreGP2) ds2).setA(a);
			 
			 
			 ((DataStoreGP2) ds2).setB(b);
			 
			
			 md.activate(factory,ds2);
			 
		 }
		 else
		 {
			 System.out.println("Incorrect input");
		 }
	}
	
	public void start()
	{   
		md.start(factory,ds2);
	}
	
	public void payCredit()
	{  
		
		md.payCredit(factory,ds2);
	}
	
	public void reject()
	{   
		
		md.reject(factory,ds2);
	}
	public void cancel()
	{  
		
		md.cancel(factory,ds2);
	}
	public void approved()
	{   
		
		md.approved(factory,ds2);
		 
	}
	
	public void Super()
	{  
		
		md.selectGas(2,factory,ds2);
	}
	
	public void regular()
	{  
		
		md.selectGas(1,factory,ds2);
	}
	
	public void startPump()
	{  
		
		md.startPump(factory,ds2);
		
	}
	public void pumpGallon()
	{  
		
		md.pump(factory,ds2);
		
	}
	public void stopPump()
	{   
		
		md.stopPump(factory,ds2);
		
		md.receipt(factory,ds2);
	}
}
   
