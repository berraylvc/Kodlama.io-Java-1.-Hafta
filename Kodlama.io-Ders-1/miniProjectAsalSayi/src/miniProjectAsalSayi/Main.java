package miniProjectAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 7;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println( number + "," +"Asal bir sayi degildir.");
			return;
		}
		
		if (number < 1) {
			System.out.println("Gecersiz sayi girdiniz.");
			return;
		}
		
		for(int i=2;i<number;i++) {
			int remainder = number %i;
			if (remainder == 0) {
				isPrime = false;
			}
			
		}
		if (isPrime) {
			System.out.println(number + "," + "Asal bir sayidir.");
		}
		else {
			System.out.println(number + "," + "Asal bir sayi degildir.");
		}

	}

}
