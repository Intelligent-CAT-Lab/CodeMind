Below is the Java translation of the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder(" ");
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
            } else {
                i++;
                if (s.charAt(i) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
            }
            i++;
        }
        System.out.println(result.toString().trim()); // trim() is to remove the initial space
    }
}
```

Please note Java uses `Scanner` class for input, `StringBuilder` for string concatenation, and `charAt` for accessing a character at a specific index. I've also added a `trim()` call to match the Python output perfectly by removing the initial space that is added in the Python code with `result = " "`.
