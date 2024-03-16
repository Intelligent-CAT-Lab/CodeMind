Here's the translated code in Java:

```java
import java.util.Scanner;

public class AZDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a_index = 0;
        int z_index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }

        System.out.println(z_index - a_index + 1);
        
        scanner.close();
    }
}
```

In this Java translation, I've used a `Scanner` object to read the input from the user, just like the `input()` function in Python. The `charAt()` method is used to access individual characters in the string, replicating the indexing used in the Python code. Java string indexing starts at 0, similar to Python. We also need to explicitly close the `Scanner` after we are done with it to prevent resource leaks.
