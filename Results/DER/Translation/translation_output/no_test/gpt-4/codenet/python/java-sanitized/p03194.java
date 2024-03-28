import java.util.Scanner;

public class p03194 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            long ans = 1;
            int count = 2;
            long tmp = (long) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p /= tmp;
                    count -= 1;
                }
                count += 1;
                tmp = (long) Math.pow(count, n);
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}