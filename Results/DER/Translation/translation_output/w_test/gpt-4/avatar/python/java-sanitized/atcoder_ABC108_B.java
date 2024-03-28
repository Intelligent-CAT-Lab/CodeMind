import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;

        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}