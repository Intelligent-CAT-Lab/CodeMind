import java.util.Scanner;

public class p02792 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] num = new int[10][10]; // In Java, the default initialization is to 0

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                String strI = Integer.toString(i);
                int firstDigit = Character.getNumericValue(strI.charAt(0));
                num[firstDigit][i % 10]++;
            }
        }

        //