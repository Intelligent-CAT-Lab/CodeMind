import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static int pow(int m, int n, int mod) {
        if (n == 0) {
            return 1;
        }
        int temp = pow(m, n / 2, mod);
        if (n % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (((temp * temp) % mod) * m) % mod;
        }
    }
}

/docs/0