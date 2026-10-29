package lab1.es04trainexample;

class Train {
	private final int nTotSeats;
	private final int nFirstClassSeats;
	private final int nSecondClassSeats;
	private int nFirstClassReservedSeats;
	private int nSecondClassReservedSeats;
	
	Train(int nFirstClassS, int nSecondClassS, int nFirstClassRS, int nSecondClassRS){
		this.nTotSeats = nFirstClassS + nSecondClassS;
		this.nFirstClassSeats = nFirstClassS;
		this.nSecondClassSeats = nSecondClassS;
		this.nFirstClassReservedSeats = nFirstClassRS;
		this.nSecondClassReservedSeats = nSecondClassRS;
	}
	
	void reserveFirstClassSeats(int number) {
		if(nFirstClassSeats - nFirstClassReservedSeats >= number) {
			nFirstClassReservedSeats += number;
		}	
	}
	void reserveSecondClassSeats(int number) {
		if(nSecondClassSeats - nSecondClassReservedSeats >= number) {
			nSecondClassReservedSeats += number;
		}	
	}
	double getTotOccupancyRatio() {
		return (100.0 * (nFirstClassReservedSeats + nSecondClassReservedSeats) / nTotSeats);
	}
	double getFirstClassOccupancyRatio() {
		return (100.0 * (nFirstClassReservedSeats) / nFirstClassSeats);
	}
	double getSecondClassOccupancyRatio() {
		return (100.0 * (nSecondClassReservedSeats) / nSecondClassSeats);
	}
	void deleteAllReservations() {
		nFirstClassReservedSeats=0;
		nSecondClassReservedSeats=0;
	}
}

