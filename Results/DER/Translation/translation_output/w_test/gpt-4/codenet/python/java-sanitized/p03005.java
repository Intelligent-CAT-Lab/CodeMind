import java.util.Scanner;

public class p03005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Logic equivalent to the Python code
        if(K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }

        scanner.close();
    }
}