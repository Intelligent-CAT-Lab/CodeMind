import java.util.Scanner;

public class p03042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2, 4));
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