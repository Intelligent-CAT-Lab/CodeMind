import java.util.Scanner;

public class p03437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = x % y;
        if (result == 0) {
            result = -1;
        }
        System.out.println(result);
    }
}