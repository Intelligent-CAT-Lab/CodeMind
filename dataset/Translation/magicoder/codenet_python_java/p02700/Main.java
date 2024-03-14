import java.util.Scanner;

public class p02700 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}