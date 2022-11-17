package week3;

public class week3_7 {

	public static void main(String[] args) {
		var number = -1;
		do {
			number = (int) (Math.random()*10);
			System.out.println(number);
		}
		while(number != 5);
		System.out.println("Found number 5");
	}

}
