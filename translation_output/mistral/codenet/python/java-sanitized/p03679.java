import java.util.Scanner;

public class p03679 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}