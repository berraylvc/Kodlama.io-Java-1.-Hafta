package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[]myList = {1.2,1.4,9.5,5.6};
		//bunu yazmayla double[] myList = new double [4]; yazmanın arasında bi fark yok
		double total = 0;
		double max = 0;
		for(double number:myList) {
			total = total + number;
			if(max<number) {
				max = number;
			}
			System.out.println(number);
		}
		System.out.println("Toplam: " + total);
		System.out.println("En Buyuk: " + max);
	}

}
