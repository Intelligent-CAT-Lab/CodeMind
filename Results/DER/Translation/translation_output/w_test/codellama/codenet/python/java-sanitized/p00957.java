import java.util.Scanner;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(rec(l, k));
    }

    public static int rec(int l, int k) {
        if (l < 0) {
            return 0;
        }
        if (l == 0) {
            return 1;
        }
        if (l % 2 == 0) {
            return rec(l - 1, k) + rec(l - k, k);
        } else {
            return rec(l - 1, k) - rec(l - k, k);
        }
    }
}