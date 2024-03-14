import java.util.Scanner;

public class p03005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}