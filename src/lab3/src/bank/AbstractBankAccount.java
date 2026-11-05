package lab3.src.bank;

public abstract class AbstractBankAccount implements BankAccount {

	 	public static final double ATM_TRANSACTION_FEE = 1;
	 	private static final double MANAGEMENT_FEE = 5;
	    private static final double TRANSACTION_FEE = 0.1;
	    
	    private double balance;
	    private int nTransactions;
	    private final int usrID;

	    public AbstractBankAccount(final int usrID, final double balance) {
	        this.usrID = usrID;
	        this.balance = balance;
	        this.nTransactions = 0;
	    }

	    protected boolean checkUser(final int id) {
	        return this.usrID == id;
	    }

	    public abstract void computeManagementFees(final int usrID);

	    public void deposit(final int usrID, final double amount) {
	        this.transactionOp(usrID, amount);
	    }

	    public abstract void depositFromATM(final int usrID, final double amount);

	    public double getBalance() {
	        return this.balance;
	    }

	    public int getNTransactions() {
	        return this.nTransactions;
	    }

	    protected void incTransactions() {
	        this.nTransactions++;
	    }

	    protected void resetTransactions() {
	        this.nTransactions = 0;
	    }

	    protected void setBalance(final double amount) {
	        this.balance = amount;
	    }

	    protected void transactionOp(final int usrID, final double amount) {
	        if (checkUser(usrID)) {
	            this.balance += amount;
	            this.incTransactions();
	        }
	    }
	    //fai l'override non abstract
	    public abstract void withdraw(final int usrID, final double amount);

	    public void withdrawFromATM(final int usrID, final double amount) {
	        this.withdraw(usrID, amount + SimpleBankAccount.ATM_TRANSACTION_FEE);
	    }
	    
	    protected abstract boolean isWithDrawAllowed(double amount);
	    protected abstract double computeFee();
}
