package week3;

public class week3_8 {

	public static void main(String[] args) {
		out: for(var i = 0; i < 5;i++) 
			 for(var j = 0;j < 4;j++) {
				System.out.printf("i = %d,j = %d%n",i,j);
				if(j == 2) break out;
			 }
	}

}
