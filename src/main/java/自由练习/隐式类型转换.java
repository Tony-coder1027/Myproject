package 自由练习;

public class 隐式类型转换 {
    public static void main(String[] args) {
        //byte<short<int<long<float<double
        //即低精度的向高精度的转换
        int x = 50;
        float y = x;
        System.out.println(y);
    }
}
