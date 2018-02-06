package by.htp.les07.ex01;

public class Fraction { //это тоже данные

	// все поля класса должны быть прайват
	private int numerator; // это данные
	private int denominator;

	public Fraction() { // конструктор по умолчанию (чтобы избежать деления на
						// ноль)
		numerator = 0;
		denominator = 1;
	}

	public Fraction(int numerator, int denominator) { // constructor
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	// для методов класса нужны сеттеры и геттеры
	public void setNumerator(int numerator) {
		this.numerator = numerator;

	}

	public int getNumerator() {
		return numerator;
	}

	public Fraction add(Fraction obj) {
		int newNumerator;
		int newDenominator;

		newDenominator = denominator * obj.denominator;
		newNumerator = numerator * obj.denominator + obj.numerator
				* denominator;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		return newFraction;
	}

	public Fraction add(int number) { //это действия ( ДАННЫЕ И ДЕЙСТВИЯ НАДО РАЗДЕЛАТЬ В ОТДЕЛЬНЫЕ КЛАССЫ!!)
		int newNumerator;
		int newDenominator;

		newDenominator = denominator;
		newNumerator = numerator * 1 + number * denominator;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}

	public void sokr() {

		int nod;
		if (numerator > denominator) {
			nod = numerator;
		} else {
			nod = denominator;
		}

		while (!((numerator % nod == 0) && (denominator % nod == 0))) {
			nod--;
		}
		
		numerator = numerator / nod;
		denominator = denominator / nod;
	}
}
