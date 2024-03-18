Below is the translated Java code for the given Python script. The Java code reads a string from the standard input and then calculates and prints out the result just like the Python code:

```java
import java.util.Scanner;

public class Main {
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
```

To compile and run this Java code, you would typically do the following steps in a terminal (assuming you have Java installed):

1. Save the code to a file named `Main.java`.
2. Compile the code with the command `javac Main.java`.
3. Run the compiled program with the command `java Main`.
4. Enter your test input (e.g., AIZU) when prompted.

The program should print `-9` as the expected output for the test input `AIZU`.
