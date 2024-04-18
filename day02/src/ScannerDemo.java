import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age= Integer.parseInt(sc.next());
        String str =sc.next();
        System.out.println(age);
        System.out.println(str);
    }
}
