import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i * (i + 1) / 2 == n) {
                System.out.println("Yes");
                System.out.println(i + 1);
                int[][] array = new int[i + 1][i];
                for (int j = 0, a = 1; j <= i; j++) {
                    for (int k = j; k < i; k++, a++) {
                        array[j][k] = array[k + 1][j] = a;
                    }
                    
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(i + " ");
                    for (int k = 0; k < i; k++) {
                        System.out.print(array[j][k] + " ");
                    }
                    System.out.println();
                }
                return;
            }
        }
        System.out.println("No");
    }
}
