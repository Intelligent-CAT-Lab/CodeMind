import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String s = scanner.next();
        int B = scanner.nextInt();

        int result;
        if ("+".equals(s)) {
            result = A + B;
        } else if ("-".equals(s)) {
            result = A - B;
        } else {
            result = 0; // Default case, assuming input will always be valid
        }
        System.out.println(result);
    }
}