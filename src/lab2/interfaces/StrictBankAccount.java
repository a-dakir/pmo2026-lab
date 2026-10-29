package lab2.interfaces;
import lab2.interfaces.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount{

	private final int userID;
	private double balance;
	private int nTransactions;
	static final double ATM_TRANSACTION_FEE = 1;
	
	public StrictBankAccount(int uID, double bal){
		this.userID = uID;
		this.balance = bal;
	}

    public void withdraw(final int usrID, final double amount) {
    	if(amount < 0 && checkUser(usrID) && this.balance-amount > 0) {
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
    	if(amount < 0 && checkUser(usrID) && this.balance-amount > 0) {
    		this.balance-= this.balance + ATM_TRANSACTION_FEE;
    		nTransactions++;
    	}

    }
    
    public void chargeManagementFees(int usrID) {
    	this.balance -= 5 + (0.1 * getTransactionsCount());
    };
    
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
