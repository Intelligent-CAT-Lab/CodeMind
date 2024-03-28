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
            int ans = 1;
            int count = 2;
            int tmp = (int)Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count--;
                }
                count++;
                tmp = (int)Math.pow(count, n);
            }
            System.out.println(ans);
        }
    }
}