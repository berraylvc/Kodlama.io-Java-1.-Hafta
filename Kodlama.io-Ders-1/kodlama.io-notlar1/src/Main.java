
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		//java case sensitive bi dildir ve isimlendirirken camelCasing kullanılır
		String mesaj = "Ogrenci Sayisi : ";
		int ogrenciSayısı = 38;
		
		System.out.println(mesaj + ogrenciSayısı);
		System.out.println(mesaj + ogrenciSayısı);
		
		//byte, short, int, long (int)(sırasıyla 1,2,4,8 byte yer kaplıyor)
		//float, double (floating, point number)(sırasıyla 4,8 byte yer kaplar)
		//boolean (true, false)(1 byte)
		//char (tek karakter tutmaya yarar) (TEK TIRNAK KULLANILIR)
		char tekKarakter = 'a';
		
		int sayi = 20;
		if(sayi<20) {
			System.out.println("sayi 20den kucuktur");
		}else if(sayi==20) {
			System.out.println("sayi 20ye esittir");
		}else{
			System.out.println("sayi 20den buyuktur");
		}
		}
		
	}


