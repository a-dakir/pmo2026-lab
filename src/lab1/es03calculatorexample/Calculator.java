package lab1.es03calculatorexample;

class Calculator {
	int nOpDone;
	double lastRes;
	
	Calculator(){
		nOpDone=0;
		lastRes=0;
	}

	
	double add(double a, double b) {
		nOpDone++;
		lastRes = a + b;
		return lastRes;
		
	}
	double sub(double a, double b) {
		nOpDone++;
		lastRes = a - b;
		return lastRes;
	}
	double mul(double a, double b) {
		nOpDone++;
		lastRes = a * b;
		return lastRes;
	}
	double div(double a, double b) {
		double r;
		if(b!=0)
			r = a / b;
		else
			r = b;
		nOpDone++;
		lastRes = r;
		return r;
	}

}
