import java.util.Scanner;

public class p01601 {
    public static boolean palind(int n) {
        return Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < 100000; i++) {
            if (n >= i && palind(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (palind(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }
}