import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);

        int[] b = {1, 4, 7, 9};
        boolean isEqual = Arrays.equals(a, b);

        String ans = isEqual ? "YES" : "NO";
        System.out.println(ans);
    }
}