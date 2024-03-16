import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] x_list = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x_list[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}