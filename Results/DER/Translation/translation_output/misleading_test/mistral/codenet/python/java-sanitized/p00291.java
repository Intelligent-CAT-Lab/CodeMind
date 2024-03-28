import java.util.Scanner;

public class p00291 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = scanner.nextInt();
        }
        int sum = input[0] + input[1] * 5 + input[2] * 10 + input[3] * 50 + input[4] * 100 + input[5] * 500;
        if (sum >= 1000) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}