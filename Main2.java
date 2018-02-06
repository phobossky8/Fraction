package by.htp.les07.ex01;

public class Main2 {

	public static void main(String[] args) {
		Fraction[] array = new Fraction[5];
		
		array[0] = new Fraction(1,2);
		array[1] = new Fraction(2,3);
		array[2] = new Fraction(3,4);
		array[3] = new Fraction(5,8);
		array[4] = new Fraction(6,11);
		
		Fraction sumFr = array[0] ;
		for(int i = 1; i < array.length; i++) {
			sumFr = sumFr.add(array[i]);
			
		}
		System.out.println(sumFr.getNumerator() + "/" + sumFr.getDenominator());

		/*for(Fraction fr : array) {
					}*/
	}

}
