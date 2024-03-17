import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String s = scanner.next();
        int B = scanner.nextInt();

        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}