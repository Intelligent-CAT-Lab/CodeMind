Here's the translated Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: "); // Assuming the input will be a single character
        String x = scanner.next().toLowerCase(); // Read input and convert to lower case for comparison

        if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close();
    }
}
```

And here is the code structured in a way that could be tested with a provided input (for example, 'a'):

```java
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Test input
        String input = "a"; // You can change this to any other character to test different inputs
        
        String output = checkVowelOrConsonant(input);
        
        // Expected output for test input
        System.out.println(output); // Should print "vowel" for input "a"
    }
    
    public static String checkVowelOrConsonant(String character) {
        if (character.equals("a") || character.equals("i") || character.equals("u") || 
            character.equals("e") || character.equals("o")) {
            return "vowel";
        } else {
            return "consonant";
        }
    }
}
```

In the first piece of code, a `Scanner` is used to get input from the user. In the second piece, the method `checkVowelOrConsonant` receives a `String` as input and returns whether the input is a vowel or consonant, which is useful for testing with static inputs.
