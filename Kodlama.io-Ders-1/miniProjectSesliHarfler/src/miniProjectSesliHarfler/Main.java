package miniProjectSesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'b';
		
		switch (harf){
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalin Sesli Harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println("Ince Sesli Harf");
			break;
			default: System.out.println("Gecersiz karakter girildi. Lutfen sesli harf giriniz.");
		}
		}

}
