import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                int result = (i - ~(j ^ (n % 2 < (j + 2 < n > i * 2)))) % n + 1;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}