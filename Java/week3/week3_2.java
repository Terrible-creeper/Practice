package week3;

import java.util.Scanner;

public class week3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade... ");
		int grade = sc.nextInt();
		if(grade >= 90) System.out.println("Level = A");
		else if(grade >= 80) System.out.println("Level = B");
		else if(grade >= 70) System.out.println("Level = C");
		else if(grade >= 60) System.out.println("Level = D");
		else System.out.println("Level = E");
	}

}
