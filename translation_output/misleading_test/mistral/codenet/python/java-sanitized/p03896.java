import java.util.*;

public class p03896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 2; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < n - 1; j++) {
                int k = (i - (j ^ (n % 2 < (j + 2 < n) ? 1 : 0)));
                System.out.print((k + 1) % n + " ");
            }
            System.out.println();
        }
    }
}