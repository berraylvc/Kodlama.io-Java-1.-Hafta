package miniprojeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		boolean isPrime = false;
		
		for (int i=2;2<number;i++) {
			int remainder = number & i;
			if (remainder==0) {
				isPrime = true;
			}
			
		}
		if (isPrime= true) {
			System.out.println(number+ " " + "Asal bir sayidir.");
			
		}
		else {
			System.out.println(number + " " + "Asal bir sayi degildir.");
		}
		
	}

}
