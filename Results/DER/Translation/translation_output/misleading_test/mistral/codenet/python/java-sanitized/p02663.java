import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
        }
        int h1 = input[0];
        int m1 = input[1];
        int h2 = input[2];
        int m2 = input[3];
        int k = input[4];
        int t1 = 60 * h1 + m1;
        int t2 = 60 * h2 + m2;
        System.out.println(t2 - t1 - k);
    }
}