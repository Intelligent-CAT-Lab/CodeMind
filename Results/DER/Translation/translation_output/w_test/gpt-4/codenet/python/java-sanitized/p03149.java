import java.util.Scanner;
import java.util.Arrays;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Splitting and parsing input into an integer array
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        // Define b
        int[] b = {1, 4, 7, 9};

        // Sort the input array
        Arrays.sort(a);

        // Check if arrays a and b are equal
        String ans = Arrays.equals(a, b) ? "YES" : "NO";
        
        // Print the result
        System.out.println(ans);
        
        scanner.close();
    }
}