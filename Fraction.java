package by.htp.les07.ex01;

public class Fraction { //��� ���� ������

	// ��� ���� ������ ������ ���� �������
	private int numerator; // ��� ������
	private int denominator;

	public Fraction() { // ����������� �� ��������� (����� �������� ������� ��
						// ����)
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

	// ��� ������� ������ ����� ������� � �������
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

	public Fraction add(int number) { //��� �������� ( ������ � �������� ���� ��������� � ��������� ������!!)
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
