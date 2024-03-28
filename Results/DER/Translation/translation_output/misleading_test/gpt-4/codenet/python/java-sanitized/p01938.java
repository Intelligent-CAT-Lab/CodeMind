import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String S = scanner.next();

        // Define the alphabet
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;

        // Loop through each character in the input string
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);

            // Commented out the print statement that was in the Python code, because it is for debugging
            // System.out.println(s + " " + Now + " " + Next);

            // If Now is greater than or equal to Next, increment ans
            if (Now >= Next) {
                ans += 1;
            }

            // Update Now to be the index of the current character
            Now = Next;
        }

        // Print the result
        System.out.println(ans);
        
        scanner.close();
    }
}