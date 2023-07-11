package C3语言基础;

public class P55练习5 {
    public static void main(String[] args) {
        int number = 123;
        int number1;
        int number2;
        int number3;
        number1 = number % 10;//number1 = 3
        number2 = number / 10 % 10;//number2 = 2
        number3 = number / 100;//number3 = 1
        System.out.println(number + "颠倒后为：" + number1 + number2 + number3);

    }
}
