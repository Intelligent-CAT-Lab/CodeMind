import java.util.Arrays;
import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[l.length - 1]) - (l[1] + l[l.length - 2])));
    }
}