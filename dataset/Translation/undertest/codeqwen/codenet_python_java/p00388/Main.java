import java.util.Scanner;

public class p00388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        int count = 0;
        for (int c = b - a + 1; c >= 0; c--) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}