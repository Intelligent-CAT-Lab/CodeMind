import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
System.out.println("[INST]7;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]7;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]8;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]8;None;sc.next();"+sc.next());

        System.out.println((b % a == 0) ? a + b : b - a);
    }
}
