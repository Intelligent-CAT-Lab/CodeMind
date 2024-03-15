Below is the translated Java code that replicates the functionality of the given Python code snippet:

```java
import java.util.Scanner;

public class UnpackAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char a = input.charAt(0);
        int lengthOfB = input.length() - 2; // excluding the first and last characters
        char c = input.charAt(input.length() - 1);
        
        System.out.print(a);
        System.out.print(lengthOfB);
        System.out.print(c);
        
        scanner.close();
    }
}
```

Explanation:

1. Java does not support the Pythonic way of unpacking elements directly, so we read the entire string and manually extract `a` and `c` by accessing the corresponding characters.
2. `lengthOfB` is calculated by subtracting 2 from the total length of the input string to ignore the first and last characters.
3. The output is printed by appending the calculated length representation in between `a` and `c`.
