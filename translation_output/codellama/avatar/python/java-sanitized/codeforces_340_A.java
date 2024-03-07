import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values of x, y, a, and b: ");
        String[] values = scanner.nextLine().split(" ");
        int x = Integer.parseInt(values[0]);
        int y = Integer.parseInt(values[1]);
        int a = Integer.parseInt(values[2]);
        int b = Integer.parseInt(values[3]);

        int lcm = LCM(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int LCM(int x, int y) {
        return x * y / GCD(x, y);
    }

    public static int GCD(int x, int y) {
        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        return y;
    }
}