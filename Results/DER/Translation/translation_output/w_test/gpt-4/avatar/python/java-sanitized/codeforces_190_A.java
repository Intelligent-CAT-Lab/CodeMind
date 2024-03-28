import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        
        int min, max;
        
        if (m > n) {
            min = m;
            max = n + m - 1;
        } else { 
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
        }

        System.out.println(min + " " + max);
    }
}