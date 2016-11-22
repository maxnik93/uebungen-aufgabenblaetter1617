package aufgabenblatt3;

public class MainRational {

	public static void main(String[] args) {
		
		Rational neuRational=new Rational(4,8);
		neuRational.printRational();
		neuRational.negate();
		neuRational.printRational();
		neuRational.invert();
		neuRational.printRational();
		System.out.println(neuRational.toDouble());
		neuRational.reduce();
		System.out.println(neuRational.reduce());
		
		Rational zweitesRational=new Rational(3,8);
		neuRational.add(zweitesRational);
		neuRational.reduce();
		neuRational.printRational();
	}

}
