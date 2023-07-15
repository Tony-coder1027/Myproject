package 自由练习;

public class 显式类型转换 {
    public static void main(String[] args) {
        //即高精度的向低精度转换
        //语法：（类型名）钥转换的值
        int a = (int)34.43;
        long b = (long)345.9F;
        int c = (int)'b';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
