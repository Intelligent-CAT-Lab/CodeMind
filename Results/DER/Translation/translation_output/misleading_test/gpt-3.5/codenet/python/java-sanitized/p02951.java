import java.util.Scanner;

public class p02951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int get = A - B;
        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}