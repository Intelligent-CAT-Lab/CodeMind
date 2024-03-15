My Solution


import java.util.Scanner;

public class p02427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 2 << n; i++) {
            int[] vs = new int[n];
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    vs[j] = 1;
                }
            }
            System.out.println("" + i + ": " + String.join(" ", vs));
        }
    }
}