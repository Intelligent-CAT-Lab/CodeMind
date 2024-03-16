import java.util.Scanner;

public class p03547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (N > M) {
            System.out.println(">");
        } else if (N == M) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}