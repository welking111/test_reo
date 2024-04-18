import java.util.Scanner;

public class OperaatorDemo {
    public static void main(String[] args) {
        System.out.println("输入一个随机整数");
        Scanner sc =new Scanner(System.in);
        int shuzi=sc.nextInt();

        System.out.print(shuzi +"千分位是：");
        System.out.println(shuzi%10000/1000);//取某个一个数字中的某个分位：先/分位再%分位
        System.out.print("百位是：");
        System.out.println(shuzi%1000/100);
        System.out.print("十分位是：");
        System.out.println(shuzi%100/10);
        System.out.print("个位是：");
        System.out.println(shuzi%10);
        System.out.println(shuzi);
        System.out.println(shuzi++);
        System.out.println(++shuzi);
        System.out.println(012);


    }

}
