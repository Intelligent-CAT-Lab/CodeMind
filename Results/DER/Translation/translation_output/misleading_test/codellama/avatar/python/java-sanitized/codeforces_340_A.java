import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int gcd = gcd(x, y);
        int lcm = lcm(x, y);

        int result = b / lcm - (a - 1) / lcm;

        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            a = b;
            b = a % b;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}