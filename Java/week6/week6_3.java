public class week6_3 {
    public static void main(String[] args) {
        int a = 5,b = 3;
        Son son = new Son();
        GrandSon sund = new GrandSon();
        son.changeMoneyNTD(666);
        son.changeMoneyUSD(5000);
        System.out.println("兒子的台幣是繼承的屬性,當前的值是: " + son.moneyNTD);
        System.out.println("兒子的美金是新增的屬性,當前的值是: " + son.moneyUSD);
        System.out.printf("減法是兒子新增的功能,%d-%d 等於 %d\n",a,b,son.subs(a, b));
        System.out.printf("加法是兒子繼承的功能,%d+%d 等於 %d\n",a,b,son.add(a, b));
        System.out.println("孫子的台幣和美金都是繼承的屬性,當前的值是");
        System.out.println("台幣: " + sund.moneyNTD + " 美金: " + sund.moneyUSD);
        System.out.printf("乘法是孫子新增的功能,%d*%d 等於 %d\n",a,b,sund.multi(a, b));
        System.out.printf("加法是孫子繼承的功能,%d+%d 等於 %d\n",a,b,sund.add(a, b));
        System.out.printf("減法是孫子繼承的功能,%d-%d 等於 %d\n",a,b,sund.subs(a, b));
    }
}