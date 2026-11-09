package lab3.src.bank;

public class ClassicBankAccount extends AbstractBankAccount{

 	private static final double ATM_TRANSACTION_FEE = 1;   
 	private static final double MANAGEMENT_FEE = 5;
	
    public ClassicBankAccount(final int usrID, final double balance) {
        super(usrID,balance);
    }

    public void computeManagementFees(final int usrID) { this.setBalance(this.getBalance() - MANAGEMENT_FEE);;}

    public void depositFromATM(final int usrID, final double amount) {
        this.deposit(usrID, amount - ATM_TRANSACTION_FEE);
    }

    public void withdraw(final int usrID, final double amount) {
        this.transactionOp(usrID, -amount);
    }

    protected boolean isWithDrawAllowed(double amount) {
    	return true;
    }
    
    protected double computeFee() { return MANAGEMENT_FEE; }
}
