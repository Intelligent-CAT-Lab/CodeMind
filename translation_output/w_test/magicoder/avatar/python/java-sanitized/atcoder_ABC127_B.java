import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}