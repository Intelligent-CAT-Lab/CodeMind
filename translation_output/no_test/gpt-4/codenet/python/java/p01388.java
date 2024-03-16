Certainly! Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        int K = countOccurrences(a, 'K');
        int U = countOccurrences(a, 'U');
        int P = countOccurrences(a, 'P');
        int C = countOccurrences(a, 'C');
        
        System.out.println(Math.min(Math.min(K, U), Math.min(P, C)));
        
        scanner.close();
    }
    
    private static int countOccurrences(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the following:
1. It imports the `Scanner` class for reading the input.
2. Defines a `CountLetters` class and its `main` method.
3. Uses the `Scanner` to read the next line of input from the user.
4. Defines a `countOccurrences` method that iterates through the string and counts the occurrences of a given character.
5. Then finds the minimum count among the characters 'K', 'U', 'P', and 'C' and prints it out.
6. Closes the `Scanner` to avoid resource leaks.
