import java.util.Scanner;

public class p02475 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = round(a, b);
        System.out.println(result);
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(int)Math.ceil((double)a / b);
        } else {
            return a / b;
        }
    }
}