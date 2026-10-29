package lab2.interfaces;
import lab2.interfaces.bank.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount {

	private final int userID;
	private double balance;
	private int nTransactions;
	static final double ATM_TRANSACTION_FEE = 1;

	public SimpleBankAccount(int uID, double bal){
		this.userID = uID;
		this.balance = bal;
	}

    public void withdraw(final int usrID, final double amount) {
    	if(amount > 0 && checkUser(usrID)) {
    		this.balance-=amount;
    		nTransactions++;
    	}

    }

    public void deposit(final int usrID, final double amount) {
    	if(amount > 0 && checkUser(usrID)) {
    		this.balance+=amount;
    		nTransactions++;
    	}

    }

    public void depositFromATM(final int usrID, final double amount) {
    	if(amount > 0 && checkUser(usrID)) {
    		this.balance+= this.balance - ATM_TRANSACTION_FEE + amount;
    		nTransactions++;
    	}
    }

    public void withdrawFromATM(final int usrID, final double amount) {
    	if(amount > 0 && checkUser(usrID)) {
    		this.balance-= amount + ATM_TRANSACTION_FEE;
    		nTransactions++;
    	}

    }
    
    public void chargeManagementFees(int usrID) {};
    
	public double getBalance() {
		return this.balance;
	}
    
    public int getTransactionsCount() {
    return this.nTransactions;
    }

    private boolean checkUser(final int id) {
        return this.userID == id;
    }
}
