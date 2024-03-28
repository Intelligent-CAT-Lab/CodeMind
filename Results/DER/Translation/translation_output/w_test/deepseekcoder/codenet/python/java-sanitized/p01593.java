import java.util.Scanner;

public class p01593 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[] dp = new double[1001];
        dp[1] =