Certainly! Below is the equivalent Java code that achieves the same functionality as the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        int e = countOccurrences(a, '+');
        int f = countOccurrences(a, '-');
        
        System.out.println(e - f);
    }
    
    private static int countOccurrences(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
```

In this Java code, we use a `Scanner` to read user input. We then count the occurrences of '+' and '-' using a helper method `countOccurrences`, which loops through the string and counts the characters. Finally, we print out the result of `e - f`.
