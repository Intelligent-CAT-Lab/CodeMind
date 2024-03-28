Here's the translated code from Python to Java:

```java
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> odd = Arrays.asList('R', 'U', 'D');
        List<Character> even = Arrays.asList('L', 'U', 'D');

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        
        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(s.charAt(j))) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
```

Remember that in Java, we use a `Scanner` to read user input and a `System.out.println` statement to print to the console. Unlike Python, Java is statically typed, so we declare the type of each variable. Additionally, we use `Arrays.asList` to initialize our list of characters for odd and even checks. We also use `charAt` to access individual characters of a string.
