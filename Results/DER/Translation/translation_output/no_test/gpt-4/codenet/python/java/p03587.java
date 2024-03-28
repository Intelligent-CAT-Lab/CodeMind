Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        String s = scanner.nextLine();

        // Count the occurrences of '1' in the string
        int onesCount = countOccurrences(s, '1');

        // Print the result
        System.out.println(onesCount);
        
        // Close the scanner
        scanner.close();
    }

    // Method to count the occurrences of a character in a string
    private static int countOccurrences(String str, char toFind) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toFind) {
                count++;
            }
        }
        return count;
    }
}
```

Note that in the Java version:

1. We use a `Scanner` to read input from the user.
2. We have a separate method called `countOccurrences` to count the occurrences of a given character in a string. This mirrors the functionality of Python's `count()` method for strings.
3. We explicitly close the `scanner` at the end to free up resources, which is considered good practice in Java.
