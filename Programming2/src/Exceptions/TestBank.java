package Exceptions;

public class TestBank {
	public static void main(String [] args) {
		BankA abank = new BankA();
		BankB bbank = new BankB();
		BankC cbank = new BankC();
		
		abank.setBalance(100);
		bbank.setBalance(150);
		cbank.setBalance(200);
		
		System.out.println("My deposits total " + (abank.getBalance() + 
				bbank.getBalance() + cbank.getBalance()));
	}
}
abstract class Bank {
    
   public double balance;
   public abstract double getBalance();
   public abstract void setBalance(double bal);
    
class BankA extends Bank {
    
    private int balance = 0;
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
	@Override
	public void setBalance(double bal) {
		// TODO Auto-generated method stub
		
	}
		
	}
}
class BankB extends Bank{
    
    private int balance = 0;
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
	@Override
	public void setBalance(double bal) {
		// TODO Auto-generated method stub
		
	}
	
    
}
class BankC extends Bank{
    
    private int balance = 0;
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
	@Override
	public void setBalance(double bal) {
		// TODO Auto-generated method stub
		
	}
	
}

	
	


