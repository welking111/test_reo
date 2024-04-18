import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r  =new Random();
        System.out.println(r.nextInt());

        //4-12之间的随机数
        System.out.println(r.nextInt(7)+4);
        //60-80之间的随机数
        System.out.println(r.nextInt(20)+60);
        for (int i = 0; i < 20; i++) {
            System.out.print(" "+r.nextInt(60,80));

        }
    }
}
