import java.util.Scanner;

public class p02682 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Initialize answer
        int ans = 0;

        // Calculate happiness for 'a'
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);

        // Happiness for 'b' doesn't change anything as its multiple is 0
        k -= Math.min(b, k);

        // Calculate happiness for 'c'
        ans += (-1) * (Math.min(c, k));
        k -= Math.min(c, k);
   
        // Print the answer
        System.out.println(ans);
        
        // Close the scanner
        scanner.close();
    }
}