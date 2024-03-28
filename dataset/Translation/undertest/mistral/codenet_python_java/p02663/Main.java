import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextIntArray(5);
        int h1 = input[0];
        int m1 = input[1];
        int h2 = input[2];
        int m2 = input[3];
        int k = input[4];

        int t1 = h1 * 60 + m1;
        int t2 = h2 * 60 + m2;

        System.out.println(t2 - t1 - k);
    }
}