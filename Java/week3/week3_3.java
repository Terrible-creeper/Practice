package week3;

public class week3_3 {

	public static void main(String[] args) {
		var score = 70;
		var level = '\0';
		if(score >= 90) level = 'A';
		else if(score >= 80) level = 'B';
		else if(score >= 70) level = 'C';
		else if(score >= 60) level = 'D';
		else level = 'E';
		System.out.printf("The grade of level is %c%n",level);

	}

}
