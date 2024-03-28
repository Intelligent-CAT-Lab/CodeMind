import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n, w, sum = 0;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}