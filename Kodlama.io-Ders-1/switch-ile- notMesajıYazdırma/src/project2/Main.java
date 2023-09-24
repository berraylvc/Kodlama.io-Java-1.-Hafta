package project2;

public class Main {

	public static void main(String[] args) {
		//not degerlendirme
		char grade = 'B';
		
		switch(grade) {
		case 'A':                
		case 'B':
			System.out.println("Very Good!");
			break;
	    case 'C':
			System.out.println("Pass");
			break;
		   case 'D':
			System.out.println("Conditional Pass");
			break;
		case 'F':
			System.out.println("Fail");
			break;
			default: 
				System.out.println("Undefined Grade!");
		
		}
	}

}
