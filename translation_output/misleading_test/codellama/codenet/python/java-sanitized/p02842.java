import java.util.Scanner;

public class p02842 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] prices = new int[50001];
        for (int i = 1; i <= 50000; i++) {
            prices[i] = (int) (i *