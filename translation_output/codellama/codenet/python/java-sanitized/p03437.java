import java.util.Scanner;

public class p03437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x % y == 0) {
            System.out.println(x);
        } else {
            System.out.println(-1);
        }
    }
}