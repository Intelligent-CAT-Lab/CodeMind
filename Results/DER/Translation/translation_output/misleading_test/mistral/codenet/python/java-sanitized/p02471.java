import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] res = gcd(a, b);
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }

    public static int[] gcd(int a, int b) {
        if (b == 0) {
            return new int[]{0, 1, a};
        }
        return gcd(b, a % b);
    }
}