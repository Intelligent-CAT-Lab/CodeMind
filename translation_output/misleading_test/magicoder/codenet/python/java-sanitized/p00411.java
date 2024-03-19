import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}


You can test this code with the following test input:


180 120 90


And it should output:


5.036376