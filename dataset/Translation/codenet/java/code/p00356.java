
import java.util.Scanner;

class p00356 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
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

