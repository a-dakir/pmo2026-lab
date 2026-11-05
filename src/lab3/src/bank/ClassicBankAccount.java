package lab3.src.bank;

public class ClassicBankAccount extends AbstractBankAccount{

    public ClassicBankAccount(final int usrID, final double balance) {
        super(usrID,balance);
    }

    public void computeManagementFees(final int usrID) {}

    public void depositFromATM(final int usrID, final double amount) {
        this.deposit(usrID, amount - SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    public void withdraw(final int usrID, final double amount) {
        this.transactionOp(usrID, -amount);
    }

    protected boolean isWithDrawAllowed(double amount) {
    	return (this.getBalance()-amount)>=0;
    }
    
    protected double computeFee() {
    	
    }
}
