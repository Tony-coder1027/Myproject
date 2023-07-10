package C3语言基础;

public class P55练习8 {
    public static void main(String[] args) {
        int a = 400;
        int b = 160;
        int h = 30;
        int d = 23;
        int r = d/2;
        int V = a*b*h;
        final double PI = 3.14;
        double v = 4/3 * PI*r*r*r;
        double number = V/v;
        int number1 = (int)number;
        System.out.println("货车最多能装下"+number1+"个西瓜");
        if(number>number1) {
            System.out.println("这100个西瓜都能装下");
        }else{
                System.out.println("货车最多能装下"+(number1-number)+"个西瓜");
            }
        }
    }

