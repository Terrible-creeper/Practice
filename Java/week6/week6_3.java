public class week6_3 {
    public static void main(String[] args) {
        int a = 5,b = 3;
        Son son = new Son();
        GrandSon sund = new GrandSon();
        son.changeMoneyNTD(666);
        son.changeMoneyUSD(5000);
        System.out.println("��l���x���O�~�Ӫ��ݩ�,��e���ȬO: " + son.moneyNTD);
        System.out.println("��l�������O�s�W���ݩ�,��e���ȬO: " + son.moneyUSD);
        System.out.printf("��k�O��l�s�W���\��,%d-%d ���� %d\n",a,b,son.subs(a, b));
        System.out.printf("�[�k�O��l�~�Ӫ��\��,%d+%d ���� %d\n",a,b,son.add(a, b));
        System.out.println("�]�l���x���M�������O�~�Ӫ��ݩ�,��e���ȬO");
        System.out.println("�x��: " + sund.moneyNTD + " ����: " + sund.moneyUSD);
        System.out.printf("���k�O�]�l�s�W���\��,%d*%d ���� %d\n",a,b,sund.multi(a, b));
        System.out.printf("�[�k�O�]�l�~�Ӫ��\��,%d+%d ���� %d\n",a,b,sund.add(a, b));
        System.out.printf("��k�O�]�l�~�Ӫ��\��,%d-%d ���� %d\n",a,b,sund.subs(a, b));
    }
}