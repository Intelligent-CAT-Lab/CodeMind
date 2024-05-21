import java.util.Scanner;

public class p02633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 1;
        while (true) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
            i++;
        }
    }
}