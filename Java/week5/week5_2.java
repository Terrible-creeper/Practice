public class week5_2 {
    public static void main(String[] args) {
        int i,sum = 0;
        double average,total = 0.0;
        int[] temp;
        int[] grades = {87,78,95};
        double[] sales = new double[4];
        sales[0] = 145.6; sales[1] = 178.9;
        sales[2] = 197.3; sales[3] = 156.7;
        temp = grades;
        for (int x : temp) {
            sum += x;
            System.out.print(" | " + x);
        }
        System.out.println("\n成績總分："+sum);
        for(i=0;i<sales.length;i++){
            total+=sales[i];
            System.out.print(" | "+sales[i]);
        }
        System.out.println("\n業績總和："+total);
        average=total/(double)sales.length;
        System.out.println("平均業績："+average);
    }
}