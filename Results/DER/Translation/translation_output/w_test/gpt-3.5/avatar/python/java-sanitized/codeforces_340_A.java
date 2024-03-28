import java.util.Scanner;

public class codeforces_340_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int a = Integer.parseInt(inputs[2]);
        int b = Integer.parseInt(inputs[3]);

        int lcm = lcm(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}