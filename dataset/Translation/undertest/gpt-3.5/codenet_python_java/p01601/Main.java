import java.util.Scanner;

public class p01601 {
    public static boolean isPalind(int n) {
        String numStr = String.valueOf(n);
        StringBuilder reverseStr = new StringBuilder(numStr).reverse();
        return numStr.equals(reverseStr.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < 100000; i++) {
            if (n >= i && isPalind(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalind(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }
}