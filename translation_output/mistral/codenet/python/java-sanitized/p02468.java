import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        long mod = 1000000007;
        long result = Math.pow(m, n, mod);
        System.out.println(result);
    }
}