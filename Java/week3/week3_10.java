package week3;

public class week3_10 {

	public static void main(String[] args) {
		for(var i = 0; i < 11; i ++) {
			System.out.println("i = "+i);
			if(i == 5) {
				System.out.println("return...");
				return;
			}
		}
	}
}
