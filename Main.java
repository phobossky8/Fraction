package by.htp.les07.ex01;

public class Main {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction(1,2);
		Fraction fr2 = new Fraction(3,4);
		
		
		Fraction fr3;
		fr3 = fr1.add(fr2);
		
		System.out.println(fr3.getNumerator() + "/" + fr3.getDenominator());
		
		fr3 = fr3.add(5);
		
		System.out.println(fr3.getNumerator() + "/" + fr3.getDenominator());

	}

}
