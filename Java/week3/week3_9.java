package week3;

public class week3_9 {

	public static void main(String[] args) {
		for(var i = 0; i < 10; i++) {
			if(i == 5) {
				System.out.println("Found number "+ i +",continue...");
				continue;
			}
			System.out.println(i);
		}
	}

}
