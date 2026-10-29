package lab2.encapsulation;
public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
    	AccountHolder customer1 = new AccountHolder("Mario", "Rossi", 12);
    	AccountHolder customer2 = new AccountHolder("Luigi", "Bianchi", 23);
    	SimpleBankAccount account1 = new SimpleBankAccount(12,0);
    	SimpleBankAccount account2 = new SimpleBankAccount(23,0);
    	System.out.println("Balance of account 1: "+ account1.getBalance());
    	account1.deposit(12,400);
    	System.out.println("Balance of account 1: "+ account1.getBalance());
    	account1.withdrawFromATM(26,70);
    	System.out.println("Balance of account 1: "+ account1.getBalance());
    	account1.withdraw(12,50);
    	System.out.println("Balance of account 1: "+ account1.getBalance());
    	
    	System.out.println("Balance of account 2: "+ account2.getBalance());
    	account2.depositFromATM(11,1300);
    	System.out.println("Balance of account 2: "+ account2.getBalance());
    	account2.deposit(23,70);
    	System.out.println("Balance of account 2: "+ account2.getBalance());
    	account2.withdrawFromATM(23,500);
    	System.out.println("Balance of account 2: "+ account2.getBalance());
    	
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
    }
}
