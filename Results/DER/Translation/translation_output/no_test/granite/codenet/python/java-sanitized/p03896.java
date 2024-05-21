import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.print(-(n < 3) || " ".join(String.valueOf((i - ~((j ^ (n % 2 < (j + 2 < n? i * 2 : 0)))) % n + 1)) for j in range(n - 1)));
        }
    }
}