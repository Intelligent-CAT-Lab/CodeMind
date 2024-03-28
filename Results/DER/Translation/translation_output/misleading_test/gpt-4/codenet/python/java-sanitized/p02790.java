import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();
        if (a <= b) {
            for (int i = 0; i < b; i++) {
                result.append(a);
            }
        } else {
            for (int i = 0; i < a; i++) {
                result.append(b);
            }
        }

        System.out.print(result.toString());
    }
}