import java.util.Scanner;

public class p00993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result + 2);
    }
}