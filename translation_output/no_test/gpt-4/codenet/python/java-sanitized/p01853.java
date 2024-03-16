import java.util.Scanner;
import java.util.Arrays;

public class p01853 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers n and m separated by a space
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Create an array of strings with length n, all initialized to "0"
        String[] points = new String[n];
        Arrays.fill(points, "0");
        
        // Update the second half of the array with the value of m converted to a string
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = Integer.toString(m);
        }
        
        // Join the array elements with spaces between them and print the result
        System.out.println(String.join(" ", points));
        
        scanner.close();
    }
}