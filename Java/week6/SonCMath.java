public class SonCMath extends CMath {
    public void getFactorial(int a) {
        int ans = 1;
        System.out.print(a+"! = ");
        for(int i = 1;i < a; i++) {
            System.out.print(i + " * ");
            ans *= i;
        }
        ans *= a;
        System.out.println(a + " = " + ans);
    }
}
