import java.util.Scanner;

public class atcoder_ABC070_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(Math.max(0, Math.min(b, d) - Math.max(a, c)));
    }
}