package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[7];
		ogrenciler[0]="Furkan";
		ogrenciler[1]="Ahmet";
		ogrenciler[2]="Ayse";
		ogrenciler[3]="Derin";
		ogrenciler[4]="Derya";
		ogrenciler[5]="Mete";
		ogrenciler[6]="Kemal";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		

	}

}
