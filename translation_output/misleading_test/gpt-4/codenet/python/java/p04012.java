Here is the equivalent Java code for the given Python script, along with the test case:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Collect the input string
        String w = sc.nextLine();
        // Define the alphabet set
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        // Check for the count of each alphabet character in the provided string
        for (int i = 0; i < alpha.length(); i++) {
            int count = countOccurrences(w, alpha.charAt(i));
            // If count is odd, print "No" and exit
            if (count % 2 == 1) {
                System.out.println("No");
                sc.close(); // Close the scanner resource before exiting
                return;
            }
        }
        // If all counts are even, print "Yes"
        System.out.println("Yes");
        sc.close(); // Close the scanner resource
    }

    private static int countOccurrences(String str, char toFind) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == toFind) {
                count++;
            }
        }
        return count;
    }
}
```

This program will reproduce the functionality of the Python script. It iterates over a set of alphabets and counts their occurrences in the provided string, checking if the count is odd or even and printing the result accordingly.

Here's a test run with the provided test case:

Test input:
```
abaccaba
```

Expected output:
```
Yes
```

Please note that Java is statically typed and needs an explicit class definition and type declarations. Additionally, resource management in Java is more explicit, like closing the Scanner object to prevent memory leak.
