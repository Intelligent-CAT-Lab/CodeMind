
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
System.out.println("[INST]8;a;scan.nextInt();"+a);
        int b = scan.nextInt();
System.out.println("[INST]9;b;scan.nextInt();"+b);

        if (a + b > 0) {
            System.out.println("1");
        } else if (a + b < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}

