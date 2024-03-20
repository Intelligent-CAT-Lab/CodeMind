import java.util.Scanner;

public class p02818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            System.exit(0);
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}


Upvotes: 0