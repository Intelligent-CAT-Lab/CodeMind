Sure, here is the translated code in Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountTwos {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();
        int count = 0;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }

        System.out.println(count);
    }
}
```
This code does the same as the Python version: it reads a string from the user input, counts the occurrences of the character '2' in the string, and prints out the count.
