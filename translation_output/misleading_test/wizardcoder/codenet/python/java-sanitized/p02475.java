import java.util.Scanner;

public class p02475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int result = round(a, b);
        System.out.println(result);
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -Math.abs(a) / b;
        } else {
            return a / b;
        }
    }
}