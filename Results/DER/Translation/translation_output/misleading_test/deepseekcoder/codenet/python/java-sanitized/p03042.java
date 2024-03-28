import java.util.Scanner;

public class p03042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = n / 100;
        int b = n % 100;

        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}