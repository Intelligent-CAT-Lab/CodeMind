import java.util.Scanner;

public class p03861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextInt();
        }
        int a = input[0];
        int b = input[1];
        int x = input[2];

        int result = (b / x - (a - 1) / x);

        System.out.println(result);
    }
}