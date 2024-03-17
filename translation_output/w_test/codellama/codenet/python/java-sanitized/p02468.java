import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = 1000000007;
        System.out.println(pow(m, n, mod));
    }

    public static int pow(int m, int n, int mod) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * m) % mod;
        }
        return result;
    }
}