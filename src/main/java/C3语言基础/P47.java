package C3语言基础;

public class P47 {
    public static void main(String[] args) {
        int boys = 15;
        int girls = 17;
        int totle = boys + girls;
        boolean result1 = ((boys > girls) && (totle > 30));
        boolean result2 = ((boys > girls) || (totle > 30));
        System.out.println("男生人数大于女生人数并且总人数大于30人：" + result1);
        System.out.println("男生人数大于女生人数或者总人数大于30人：" + result2);
    }
}
