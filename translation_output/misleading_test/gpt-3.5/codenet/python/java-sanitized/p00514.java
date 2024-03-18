import java.util.Scanner;

public class p00514 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();

        int[] sortedArray = new int[2];
        if (n - 1 > r - m * n) {
            sortedArray[0] = r - m * n;
            sortedArray[1] = n - 1;
        } else {
            sortedArray[0] = n - 1;
            sortedArray[1] = r - m * n;
        }

        int a = sortedArray[0];
        int b = sortedArray[1];
        
        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= (i + 1);
        }

        long u = 1;
        for (int i = b; i < a + b; i++) {
            u *= (i + 1);
        }

        if (a < 1) {
            System.out.println(0);
        } else {
            System.out.println(u / d);
        }
    }
}