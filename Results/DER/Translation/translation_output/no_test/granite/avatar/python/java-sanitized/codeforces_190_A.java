import java.util.*;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                System.exit(0);
            }
            System.out.println("Impossible");
            System.exit(0);
        }

        int min, max;
        if (m > n) {
            min = m;
            max = n + m - 1;
        } else {
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
        }

        System.out.println(min + " " + max);
    }
}