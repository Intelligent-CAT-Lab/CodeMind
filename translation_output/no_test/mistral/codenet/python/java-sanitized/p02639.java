import java.util.Arrays;
import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int[] x_list = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            x_list[i] = Integer.parseInt(split[i]);
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}