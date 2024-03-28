Here is the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class MysteryStringSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] a = input.toCharArray();
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '?') {
                a[i] = 'D';
            }
        }
        
        String b = new String(a);
        System.out.println(b);
        
        scanner.close();
    }
}
```

This Java code reads an input line from the user, converts it into a character array, replaces '?' characters with 'D', reassembles the characters into a String, then prints the modified string to the console.
