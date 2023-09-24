package project1;

public class Main {
    
	public static void main(String[] args) {
		   //en buyuk sayıyı bulma
		int sayi1 = 70;
		int sayi2 = 34;
		int sayi3 = 87;
		
		if(sayi1<sayi2 && sayi2<sayi3) {
			System.out.println("sayi3 buyuktur");
		}else if(sayi1<sayi3 && sayi3<sayi2) {
			System.out.println("sayi2 buyuktur");
		}
		if(sayi2<sayi1 && sayi1<sayi3) {
			System.out.println("sayi3 buyuktur");
		}else if(sayi2<sayi3 && sayi3<sayi1){
			System.out.println("sayi1 buyuktur");
		}
		if (sayi3<sayi1 && sayi1<sayi2) {
			System.out.println("sayi2 buyuktur");
		}else if(sayi3<sayi2 && sayi2<sayi1) {
			System.out.println("sayi1 buyuktur");
		}
        //another way
		int enBuyuk = sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En buyuk sayi: "+enBuyuk);
		
	}

}
