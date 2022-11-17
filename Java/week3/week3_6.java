package week3;

public class week3_6 {

	public static void main(String[] args) {
		while(true) {
			var number = (int) (Math.random()*10);
			System.out.println(number);
			if(number == 6) {
				System.out.printf("Found number %d,leaving...%n",number);
				break;
			}
		}
	}

}
