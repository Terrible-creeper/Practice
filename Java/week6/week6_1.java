public class week6_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("�{��");
        char[] charArr = {'J','a','v','a'};
        System.out.println("��l�r�ꤺ�e: " + sb);
        sb.append('-');
        System.out.println("�s�W�r��\'-\': "+ sb);
        sb.append(charArr,0,4);
        System.out.println("�s�W�r���}�C: "+ sb);
        sb.append("�{���d�ұХ�");
        System.out.println("�s�W�r��: "+ sb);
        sb.deleteCharAt(2);
        System.out.println("�R����3�Ӧr: "+ sb);
        sb.delete(0, 2);
        System.out.println("�R���e2�Ӧr: "+ sb);
        sb.insert(6,"�]�p");
        System.out.println("���J����r��: "+ sb);
        sb.insert(4,"SE");
        System.out.println("���J�^��r��: "+ sb);
        sb.setCharAt(4, 'E');
        System.out.println("���N�r��: "+ sb);
        sb.replace(0, 7, "JDK SE");
        System.out.println("���N�r��: "+ sb);
        sb.reverse();
        System.out.println("�����r��: "+ sb);
    }
}