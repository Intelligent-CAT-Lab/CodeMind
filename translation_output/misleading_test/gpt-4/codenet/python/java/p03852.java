Below is the equivalent Java program for the Python code you've provided. Java requires more boilerplate code, such as class and method definitions, and input handling is more verbose compared to Python. Here's how the translation looks:

```java
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String x = scanner.next().toLowerCase(); // Assuming we want to ignore case as Python is case-sensitive

        // We ensure that only the first character is checked even if the user enters more than one character
        char firstChar = x.charAt(0); 

        if (firstChar == 'a' || firstChar == 'i' || firstChar == 'u' || firstChar == 'e' || firstChar == 'o') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close();
    }
}
```

Remember to run the program, the user has to input a character. If the character is a vowel ('a', 'i', 'u', 'e', or 'o'), the program will print "vowel". Otherwise, it will print "consonant".

This program assumes that you want to check only for lowercase vowels. If you also want to handle uppercase vowels, you would need to either convert the input to lowercase (as done in the code) or check against both lowercase and uppercase vowels in the condition.
