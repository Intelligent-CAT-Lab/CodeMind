Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int countP = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                countP++;
            }
        }
        
        System.out.println((s.length() / 2) - countP);
        scanner.close();
    }
}
```

This Java code does the following: it reads a string from the user input, counts the occurrences of the letter 'p', and then prints out the result of `(length of the string) / 2 - (count of 'p's)`.
