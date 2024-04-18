import java.util.Random;

public class ArrystDemo {
    public static void main(String[] args) {
        int [] arrint =new int[10];
        Random r =new Random();
        for (int i = 0; i < arrint.length; i++) {
            arrint[i]=r.nextInt(0,100);
            System.out.print(arrint[i]+",");
        }
        for (int i = 0; i <arrint.length ; i++) {
            for (int j =arrint.length-1; j > i; j--) {
              if (arrint[j]<arrint[j-1]){
                    int tmp= arrint[j];
                   arrint[j]=arrint[j-1];
                   arrint[j-1]=tmp;
                }
            }

        }
        System.out.println("冒泡排序:");
        for (int j : arrint) {
            System.out.println(j);
        }
    }
}
