# Programmazione ad Oggetti - Laboratorio 01
## Esercizio 5 - array

#### FASE 1 - Arrays

1. Si analizzi il metodo `countOccurencies()` della classe `WorkWithArrays`, aiutandosi con l'utilità di test `boolean testCountOccurrencies()`
2. Si compili ed esegua la classe
3. Si aggiunga un nuovo test al metodo `testCountOccurr()`
4. Si compili e si esegua nuovamente
5. Si completino i seguenti metodi statici nella classe `WorkWithArrays`:
    - `public static int[] evenElements(int[] array)`, che restituisce un array con i soli elementi in posizione (indice) *pari* dell'array fornito in input, ad esempio `evenElems([1, 2, 3, 4]) => [1, 3]`
    - `public static int[] oddElements(int[] array)` che restituisce un array con i soli elementi in posizione (indice) *dispari* dell'array fornito in input, ad esempio `oddElems([1, 2, 3, 4] => [2,4]`
    - `public static int mostRecurringElement(int[] array)` che restituisce l'elemento che viene ripetuto più volte all'interno `array`, ad esempio p.e. `mostRecurringElement([1, 2, 1, 3, 4] => 1`, `mostRecurringElement([7,1,5,7,7,9]) => 7`

#### FASE 2 - Inversione e duplicazione

1. Implementare il metodo `public static int[] revertUpTo(int[] array, int stopElement)`, che inverte gli elementi di `array` dall'inizio fino alla prima occorrenza dell'elemento `stopElement` *inclusa*. Gli elementi successivi alla suddetta occorrenza devono rimanere invariati, per esempio `revertUpTo([1,2,3,4,5,6,7], 5) => [5,4,3,2,1,6,7]`

#### FASE 3 - Array di oggetti

Completare la classe `PlayWithSmartphoneArrays`, che lavora sulla classe `Smartphone` costruita in precedenza, implementando i seguenti metodi che restituiscono il numero di smartphone che rispettano le preferenze fornite dagli utenti:

1. `static int search(Smartphone[] array, String brand)`
2. `static int search(Smartphone[] array, boolean hasNFC, boolean hasGPS)`
3. `static int search(Smartphone[] array, int nCPUs, int sdSize, boolean has3G)`

