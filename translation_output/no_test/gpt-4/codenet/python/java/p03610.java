Sure, the equivalent Java code to get a string from the user and print every second character could look like this:

```java
import java.util.Scanner;

public class EverySecondCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
```

In this Java code, `Scanner` is used for input instead of `input()`, and a `StringBuilder` is used to efficiently build the new string with every second character. Then, it prints out the resulting string to the console.
