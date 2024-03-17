import java.util.Scanner;

public class p02930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int x = (i ^ j);
                int ct = 0;
                while (x > 0) {
                    x = x >> 1;
                    ct++;
                }
                System.out.print(ct + " ");
            }
            System.out.println();
        }
    }
}