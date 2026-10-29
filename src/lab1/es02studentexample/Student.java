package lab1.es02studentexample;
class Student {

    // ... Aggiungere qui la definizione dei campi
	String name;
	String surname;
	int id;
	int matriculationYear;

    void build(String name, String surname, int id, int matrYr) {
    	this.name = name;
    	this.surname = surname;
    	this.id = id;
    	this.matriculationYear = matrYr;
    }

    void printStudentInfo() {
        /*
         * Aggiungere i comandi per la stampa delle informazioni sullo studente
         */
    	System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Student ID: " + this.id + ", Matriculation Year: " + this.matriculationYear +";");
    }
}
