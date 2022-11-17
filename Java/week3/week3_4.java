package week3;

public class week3_4 {

	public static void main(String[] args) {
		final var warning = "(Failed)";
		var score = 59;
		var quotient = score/10;
		var level = switch(quotient) {
			case 10,9 -> "A";
			case 8 -> "B";
			case 7 -> "C";
			case 6 -> "D";
			default -> {
				String message = "E" + warning;
				yield message;
			}
		};
		System.out.println("Your level = " + level);

	}

}
