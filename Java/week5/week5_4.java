public class week5_4 {
    public static void main(String[] args) {
        int total = 0,sum;
        int[][] scores = {{54,68},{67,78},{89,93}};
        for(int j = 0; j < scores.length;j++) {
            sum = 0;
            for(int i = 0;i <scores[j].length;i++) {
                System.out.print(scores[j][i] + " ");
                sum += scores[j][i];
                total += scores[j][i];
            }
            System.out.println("==>總得分: " + sum);
        }
        System.out.println("得分總和: " + total);
        double[][] sales = new double[4][];
        for (int i = 0; i < sales.length; i++) sales[i] = new double[2];
        sales[0][0] = 123.4;    sales[0][1] = 143.5;
        sales[1][0] = 142.3;    sales[1][1] = 198.4;
        sales[2][0] = 234.6;    sales[2][1] = 200.5;
        sales[3][0] = 167.1;    sales[3][1] = 150.4;
        System.out.println("業績報表: ");
        System.out.println("季\t第一年\t第二年");
        for (int j = 0; j < sales.length; j++) {
            System.out.print("第"+ (j+1) + "季\t ");
            for (int i = 0; i < sales[i].length; i++) {
                System.out.print(sales[j][i] + "\t"); 
            }
            System.out.println();
        }
    }
}