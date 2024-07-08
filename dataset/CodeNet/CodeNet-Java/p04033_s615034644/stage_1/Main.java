import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a * b <= 0l) {
            System.out.println("Zero");
            return;
        }

        if (a > 0l) {
            System.out.println("Positive");
            return;
        }

        if ((b - a) % 2l == 1l) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}