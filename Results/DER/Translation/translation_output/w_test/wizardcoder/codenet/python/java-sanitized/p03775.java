import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = Math.max(result, Math.max(String.valueOf(i).length(), String.valueOf(n/i).length()));
            }
        }
        System.out.println(result);
    }
}