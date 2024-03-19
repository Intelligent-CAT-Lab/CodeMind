import java.util.Scanner;

public class p03923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a;
        n = scanner.nextInt();
        a = scanner.nextInt();
        int t = n;
        for (int k = 1; k <= (int) Math.ceil(Math.log(n) / Math.log(2)); k++) {
            int d = (int) Math.ceil(Math.pow(n,