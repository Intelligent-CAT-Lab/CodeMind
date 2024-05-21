import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int n = a + b;
        int sqrtn = (int) Math.sqrt(n);
        boolean isPerfectSquare = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}