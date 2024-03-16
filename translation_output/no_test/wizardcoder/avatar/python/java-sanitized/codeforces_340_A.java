import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);

        int gcd = GCD(x, y);
        int lcm = x * y / gcd;

        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int GCD(int a, int b) {
        while (a % b!= 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}