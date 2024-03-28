import java.util.Scanner;

public class p03779 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int t = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}