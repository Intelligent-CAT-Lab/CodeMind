Here is the equivalent Java code for the given Python code snippet. The Python code takes a string as input and prints every second character of the string. Below is the Java version of this code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
```

To run the code for the test input `atcoder`, the output would be `acdr`, skipping every second character.
