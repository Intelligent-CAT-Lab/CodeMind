import java.util.Scanner;

public class p00993 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        result += 2;

        System.out.println(result);

        for (int i = 1; i <= n; i++) {
            System.out.println(i+1);
        }
    }
}