package C3语言基础;

public class P51 {
    public static void main(String[] args) {
        int mybyte = 127;
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println("byte型与float型数据进行运算结果为："+(mybyte + myfloat));
        System.out.println("byte型与int型数据进行运算结果为："+mybyte*myint);
        System.out.println("byte 型与char型数据进行运算结果为："+mybyte/mychar);
        System.out.println("double型与char型数据进行运算结果为："+(mydouble+mychar));
    }
}
