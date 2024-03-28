import java.util.Scanner;

public class p03923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int t = n;
        for (int k = 1; k <= Math.ceil(Math.log2(n)); k++) {
            int d = (int) Math.ceil(Math.pow(n,