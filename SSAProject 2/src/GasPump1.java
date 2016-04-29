


public class GasPump1 {
	
	private DataStore ds1;
	private MdaClass md;
	private AbstractFactory factory;
	public GasPump1(MdaClass md, DataStore ds1 ,AbstractFactory factory)
	{
		this.ds1 = ds1;
		this.md = md;
	    this.factory = factory;
				
	}
	
	
	public void activate(int a)
	{
		 if(a > 0)
		 {  
			 System.out.println("Setting the temporary  A value  IN DATA STORE\n");
			 ((DataStoreGP1) ds1).setA(a);
			 md.activate(factory,ds1);	 
		 }
		 else
		 {
			 System.out.println("Incorrect input");
		 }
	}
	
	public void start()
	{  
		md.start(factory,ds1);
	}
	
	public void payCredit()
	{   
		md.payCredit(factory,ds1);
	}
	
	public void reject()
	{  
		md.reject(factory,ds1);
	}
	public void cancel()
	{   
		md.cancel(factory,ds1);
	}
	public void approved()
	{
		md.approved(factory,ds1);
		 
	}
	
	public void payCash(int c)
	{
		if(c>0)
		{   

			((DataStoreGP1) ds1).setC(c);

			md.payCash(factory,ds1);
		}
			
	}
	public void startPump()
	{   
		
		md.selectGas(1,factory,ds1);
		
		md.startPump(factory,ds1);
		
	}
	public void pumpGallon()
	{  
	
		if( ds1.getW()==1)
		{   
			md.pump(factory,ds1);
		}
		else if(ds1.getW()==0)
		{  
			if(((DataStoreGP1) ds1).getCash()<(ds1.getGas()+1)*((DataStoreGP1) ds1).getPrice())
			{ 
				
				md.pump(factory,ds1);
				md.receipt(factory,ds1);
			}
		
			else
			{  
				System.out.println("Calling pump function in mda class");
				
				md.stopPump(factory,ds1);
			}
		}
		
	}
	public void stopPump()
	{  
		md.stopPump(factory,ds1);
		md.receipt(factory,ds1);
	}
}
   