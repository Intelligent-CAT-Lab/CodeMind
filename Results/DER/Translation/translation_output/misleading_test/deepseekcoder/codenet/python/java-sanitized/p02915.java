import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println((int)Math.pow(n, 3));
        }
        scanner.close();
    }
}