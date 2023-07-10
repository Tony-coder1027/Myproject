package C3语言基础;

public class P38训练2 {
    //谁该缴税
    public static void main(String[] args) {
        int a = 4500;
        int b = 5500;
        if(a>5000){
            System.out.println("员工a需要缴纳个人所得税");
        } else  {
            System.out.println("员工a不需要缴纳个人所得税");
        }
        if(b>5000){
            System.out.println("员工b需要缴纳个人所得税");
        }else {
            System.out.println("员工b不需要缴纳个人所得税");
        }
    }
}
