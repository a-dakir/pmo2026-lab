package lab3.src.bank;

public class RestrictedBankAccount extends AbstractBankAccount {
	
 	private static final double ATM_TRANSACTION_FEE = 1;
 	private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;
    
    public RestrictedBankAccount(final int usrID, final double balance) {
        super(usrID,balance);
    }

    public void computeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + (this.getNTransactions() * TRANSACTION_FEE);
        if (checkUser(usrID) && isWithDrawAllowed(feeAmount)) {
            this.setBalance(this.getBalance()- feeAmount);
            this.resetTransactions();
        }
    }

    public void depositFromATM(final int usrID, final double amount) {
        this.deposit(usrID, amount - ATM_TRANSACTION_FEE);
    }

    public void withdraw(final int usrID, final double amount) {
        
        if (this.isWithDrawAllowed(amount)) {
        	this.transactionOp(usrID, -amount);
        }
    }

    protected boolean isWithDrawAllowed(double amount) {
    	return this.getBalance() >= amount;
    }
    
    protected double computeFee() {
        return MANAGEMENT_FEE + (getNTransactions() * TRANSACTION_FEE);
    }
}

