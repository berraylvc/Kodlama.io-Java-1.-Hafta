package stringsDemo2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		//5'i dahil etmediğine dikkat!
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj3 = "  Bugun hava guzel.  ";
		System.out.println(mesaj3.trim());
				

	}

}
