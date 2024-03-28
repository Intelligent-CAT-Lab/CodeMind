import java.util.Scanner;

public class p02223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1");
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("2");
            System.out.println("0");
            System.out.println("11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.println("1" + "0".repeat(i) + "1");
            }
        }
    }
}