import java.util.Scanner;

public class p02835 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a + b + c < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}