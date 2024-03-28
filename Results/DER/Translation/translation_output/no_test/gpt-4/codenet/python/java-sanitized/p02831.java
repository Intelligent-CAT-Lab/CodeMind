import java.util.Scanner;

public class p02831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        System.out.println(lcm(A, B));
    }

    /**
     * ユークリッド互除法を使った最大公約数の求め方
     * @param a First number
     * @param b Second number
     * @return Greatest common divisor of a and b
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    /**
     * 最小公倍数の求め方
     * @param a First number
     * @param b Second number
     * @return Least common multiple of a and b
     */
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}