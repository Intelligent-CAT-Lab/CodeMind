import java.util.Scanner;

public class p02427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}