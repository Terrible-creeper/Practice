class test01 {
    public static void main(String[] args) {
        int l[] = {1,2,3,4,5,6,7,8,9,10};
        int ans = 0;
        for (int i : l) {
            ans += i;
        }
        System.out.println("1+2+...+10 = " + ans);
    }
}