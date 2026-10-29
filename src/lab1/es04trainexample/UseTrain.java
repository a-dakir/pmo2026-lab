package lab1.es04trainexample;

class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */
    	Train t = new Train(40,160,2,70);
    	t.reserveFirstClassSeats(8);
    	System.out.println("Total Occupancy Ratio: " + t.getTotOccupancyRatio());
    	System.out.println("First Class Occupancy Ratio: " + t.getFirstClassOccupancyRatio());
    	t.reserveSecondClassSeats(44);
    	System.out.println("Total Occupancy Ratio: " + t.getTotOccupancyRatio());
    	System.out.println("Second Class Occupancy Ratio: " + t.getSecondClassOccupancyRatio());
    	t.deleteAllReservations();
    	t.reserveFirstClassSeats(38);
    	System.out.println("Total Occupancy Ratio: " + t.getTotOccupancyRatio());
    	System.out.println("First Class Occupancy Ratio: " + t.getFirstClassOccupancyRatio());
    	t.reserveSecondClassSeats(91);
    	System.out.println("Total Occupancy Ratio: " + t.getTotOccupancyRatio());
    	System.out.println("Second Class Occupancy Ratio: " + t.getSecondClassOccupancyRatio());
    	
    }
}
