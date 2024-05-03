import java.util.Scanner;

public class p03005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}