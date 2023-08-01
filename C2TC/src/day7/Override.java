package day7;

public class Override {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 SBI s;
			 Bank b;
			 HDFC h;
			 s=new SBI();
			 s.Intrest();
			 
			 b=new Bank();
			 b.Interest();
			 
			// s=new RBI();
			// s.Intrest();
			 
			b=new SBI();
			b.Interest();
			 b=new Bank();
			 b.Interest();
			h=new HDFC();
			h.Interest();
			 

	}
}
