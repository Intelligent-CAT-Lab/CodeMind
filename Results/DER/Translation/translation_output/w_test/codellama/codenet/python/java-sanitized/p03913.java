import java.util.Scanner;

public class p03913 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K <= 50; K++) {
            int n = (int) Math.pow(N,