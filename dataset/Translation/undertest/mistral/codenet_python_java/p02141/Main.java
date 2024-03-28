import java.util.Arrays;
import java.util.Scanner;

public class p02141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ");
        int W = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        int x = Integer.parseInt(input[4]);
        int y = Integer.parseInt(input[5]);

        int a = (Math.min(W / 2, x + w / 2) + Math.max(-W / 2, x - w / 2));
        int b = (Math.min(H / 2, y + h / 2) + Math.max(-H / 2, y - h / 2));
        double result = (double) b / a;
        System.out.println(result);
    }
}