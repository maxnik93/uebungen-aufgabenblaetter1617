package aufgabenblatt3;

class Rational {
	
	//Sehr gut soweit. Nur ein, zwei kleine Anmerkungen :)

	
	//Ganzzahl integer hätte für die Bruchdarstellung gereicht.
	double zaehler;
	double nenner; 
	
	public Rational(){
		this.zaehler=0;
		this.nenner=1;		
	}
	
	public Rational(int zaehler,int nenner){
		this.zaehler=zaehler;
		this.nenner=nenner;
	}
	
	void printRational (){
		System.out.println(this.zaehler+"/"+this.nenner);
	}
	
	void setZaehler(int zaehler){
		this.zaehler=zaehler;
	}
	
	void setNenner(int nenner){
		this.nenner=nenner;
	}
	
	void negate(){
		this.zaehler=-this.zaehler;		
	}
	
	void invert(){
		double a=this.zaehler;
		this.zaehler=this.nenner;
		this.nenner=a;
	}
	
	double toDouble(){
		return this.zaehler/this.nenner;
	}
	
	double reduce(){
		
		double reducedZaehler=this.zaehler;
		double reducedNenner=this.nenner;
				
		for (int i=2;i<=Math.min(Math.abs(reducedZaehler),Math.abs(reducedNenner));i++){
			
			if (reducedZaehler % i==0 && reducedNenner % i==0){
				reducedZaehler=reducedZaehler/i;
				reducedNenner=reducedNenner/i;
								i=i-1;		//Formatierung!		
			}
		}
	
		System.out.println(reducedZaehler+"/"+reducedNenner);
		return reducedZaehler/reducedNenner;
		
	}
	
	void add(Rational b){
		double neuerNenner=this.nenner*b.nenner;
		double aNeuerZaehler=b.nenner*this.zaehler;
		double bNeuerZaehler=this.nenner*b.zaehler;
		this.zaehler=aNeuerZaehler+bNeuerZaehler;	
		
		this.nenner=neuerNenner;
			
	}

}
