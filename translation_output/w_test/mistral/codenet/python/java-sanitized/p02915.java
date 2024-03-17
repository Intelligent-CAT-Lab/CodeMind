import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.println(n * n * n);
        }
    }
}