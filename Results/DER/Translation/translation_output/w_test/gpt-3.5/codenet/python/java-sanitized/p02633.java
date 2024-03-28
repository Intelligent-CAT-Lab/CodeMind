import java.util.Scanner;

public class p02633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        for (int i = 1; i < 100000; i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}