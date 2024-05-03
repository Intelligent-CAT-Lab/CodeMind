import java.util.Arrays;
import java.util.Scanner;

public class p02141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int W = inputs[0];
        int H = inputs[1];
        int w = inputs[2];
        int h = inputs[3];
        int x = inputs[4];
        int y = inputs[5];

        int a = (Math.min(W / 2, x + w / 2) + Math.max(-W / 2, x - w / 2));
        int b = (Math.min(H / 2, y + h / 2) + Math.max(-H / 2, y - h / 2));
        System.out.println((double) b / a);
    }
}