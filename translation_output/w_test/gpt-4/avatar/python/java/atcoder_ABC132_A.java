Here's the translation of your provided Python code into Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        char[] s = input.toCharArray();
        Arrays.sort(s);
        
        if (s.length >= 4 &&
            s[0] == s[1] && 
            s[2] == s[3] && 
            s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

To run the Java program with the test input:

```
STOP
```

The expected output would be:

```
No
```

The Java program sorts the characters of the input string and compares them exactly as the Python code does. If the conditions are met (i.e., the first two characters are the same, the next two characters are the same, and the first pair of characters is different from the second pair), the program prints "Yes"; otherwise, it prints "No".
