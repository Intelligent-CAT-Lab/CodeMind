import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}