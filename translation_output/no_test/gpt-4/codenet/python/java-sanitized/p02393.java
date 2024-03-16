import java.util.Arrays;
import java.util.Scanner;

public class p02393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] s = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            s[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(s);

        // Assuming that the input always contains at least 3 integers.
        // Otherwise, you'd have to add additional checks.
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}