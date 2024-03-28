import java.util.Scanner;

public class p02970 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(-(n / (2 * d + 1)));
    }
}