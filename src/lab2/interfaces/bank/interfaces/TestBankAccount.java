package lab2.interfaces.bank.interfaces;
import lab2.interfaces.AccountHolder;
import lab2.interfaces.SimpleBankAccount;
import lab2.interfaces.StrictBankAccount;

public final class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1
         */
    	AccountHolder customer1 = new AccountHolder("Mario","Rossi",1);
        /*
         * 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2
         */
    	AccountHolder customer2 = new AccountHolder("Luigi","Bianchi",2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di Mario
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Luigi Bianchi (ammontare iniziale = 0)
         */
    	BankAccount account1 = new SimpleBankAccount(1,0);
    	BankAccount account2 = new StrictBankAccount(2,0);
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         * 
         * A: Perché le interfacce ci permettono di creare diverse 
         *    implementazioni tra cui scegliere al momento di inizializzazione degli oggetti;
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
    	account1.deposit(1, 10000);
    	account2.deposit(2, 10000);
        /*
         * 6) Prelevare €15000 da entrambi i conti
         */
    	account1.withdraw(1, 15000);
    	account2.withdraw(2, 15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
    	System.out.println("Balance of Account 1: "+account1.getBalance());
    	System.out.println("Balance of Account 2: "+account2.getBalance());
    	
        /*
         * 8) Qual è il risultato e perché?
         * 
         * A: "Balance of Account 1: -5000.0
			   Balance of Account 2: 10000.0"
			   Il SimpleBankAccount permette di andare in negativo nei Prelievi, mentre lo StrictBankAccount non lo permette,
			   bloccando il Prelievo di 15000 e rimanendo pertanto a 10000 di Balance.
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
    	account1.deposit(1, 10000);
    	account2.deposit(2, 10000);
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
    	account1.chargeManagementFees(1);
    	account2.chargeManagementFees(2);
        /*
         * 11) Stampare a video l'ammontare corrente
         */
    	System.out.println("Balance of Account 1: "+account1.getBalance());
    	System.out.println("Balance of Account 2: "+account2.getBalance());
        /*
         * 12) Qual è il risultato e perché?
         * 
         * A:	"Balance of Account 1: 5000.0
				 Balance of Account 2: 19994.8"
				 Il SimpleBankAccount, che era precedentemente a -5000, è incrementato di 10000 portandolo a 5000,
				 non sono stati addebitati costi di gestione in quanto il metodo è vuoto.
				 Lo StrictBankAccount, che era precedentemente a 10000, è incrementato di 10000 portandolo a 20000,
				 sono stati addebitati costi di gestione.
         */

    }
}
