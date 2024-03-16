import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= b) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            for (int i = 0; i < a; i++) {
                System.out.print(b);
            }
        }
    }
}