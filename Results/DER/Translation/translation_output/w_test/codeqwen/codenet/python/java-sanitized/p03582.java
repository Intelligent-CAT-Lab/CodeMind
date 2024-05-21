import java.util.Arrays;
import java.util.Scanner;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] L = new int[a + b + c];
        Arrays.fill(L, 0, a, 0);
        Arrays.fill(L, a, a + b, 1);
        Arrays.fill(L, a + b, a + b + c, 2);

        while (L.length > 1) {
            L[0] += L[L.length - 1];
            L = Arrays.copyOfRange(L, 0, L.length - 1);
            Arrays.sort(L);
        }

        StringBuilder result = new StringBuilder();
        for (int i : L) {
            result.append((char) ('a' + i));
        }

        System.out.println(result.toString());
    }
}