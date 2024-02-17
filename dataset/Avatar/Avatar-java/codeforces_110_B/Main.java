import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println('a');
        } else if (n == 2) {
            System.out.println("ab");
        } else if (n == 3) {
            System.out.println("abc");
        } else {
            for (int i = 0; i < n / 4; i++) {
                System.out.print("abcd");
            }
            int t = n % 4;
            if (t == 1) {
                System.out.println('a');
            } else if (t == 2) {
                System.out.println("ab");
            } else if (t == 3) {
                System.out.println("abc");
            }
        }
    }
}