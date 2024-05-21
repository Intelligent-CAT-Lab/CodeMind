import java.util.Scanner;

public class p01722 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        if (n == 0) {
            result = 1;
        } else {
            result = 2 / n;
        }
        System.out.println(result);
    }
}