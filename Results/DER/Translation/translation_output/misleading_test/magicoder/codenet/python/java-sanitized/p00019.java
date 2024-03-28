import java.util.Scanner;

public class p00019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = 1;
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        System.out.println(k);
    }
}