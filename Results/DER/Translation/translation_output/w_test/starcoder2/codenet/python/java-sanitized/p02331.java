import java.util.Scanner;

public class p02331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = 1000000007;
        System.out.println(Math.pow(k, n) % MOD);
    }
}