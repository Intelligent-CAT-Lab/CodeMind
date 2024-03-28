import java.util.Scanner;

public class p02765 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        n = scanner.nextInt();
        r = scanner.nextInt();
        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}