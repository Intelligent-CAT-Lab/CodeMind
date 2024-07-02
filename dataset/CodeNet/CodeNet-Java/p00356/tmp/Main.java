
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
System.out.println("[INST]7;x;scan.nextInt();"+x);
        int y = scan.nextInt();
System.out.println("[INST]8;y;scan.nextInt();"+y);
        int p = 0;
        int a;
        int b;
        int z;
        int m;
        a = x;
        b = y;
        while (x % y != 0) {
            z = x;
            x = y;
            y = z % y;
        }
        m = a + b - y;

        if (a % 2 == 0 || b % 2 == 0 || a == b || a % 2 > 0 && b % 2 > 0) {
            System.out.println(m + 1);
        } else {
            System.out.println(m);
        }

    }
}

