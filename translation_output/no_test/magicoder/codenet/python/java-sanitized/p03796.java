import java.util.Scanner;

public class p03796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = (factorial * i) % 1000000007;
        }
        System.out.println(factorial);
    }
}