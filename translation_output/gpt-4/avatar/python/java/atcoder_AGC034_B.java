Here is the translated version of your Python code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        S = S.replace("BC", "D");
        int A_count = 0;
        int ans = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                A_count += 1;
            } else if (S.charAt(i) == 'D') {
                ans += A_count;
            } else {
                A_count = 0;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Make sure to run this Java code inside a class. This example assumes the class is named `Main`. Java requires specifying the data types for variables and use of the `charAt(index)` method to access characters in a string, rather than using the square bracket notation as in Python. Also, keep in mind that Java indexes and char literals are denoted by single quotes, unlike Python which uses double quotes for a single character. The `Scanner` class is used for user input in Java, instead of the `input()` function in Python.
