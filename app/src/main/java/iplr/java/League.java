package iplr.java;



class League {
	CodesJson cj;

	public League(CodesJson cj) {
		this.cj = cj;
	}

	public void run() {
		cj.print();
	}
}
