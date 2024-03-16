Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = countOccurrences(a, '+');
        int f = countOccurrences(a, '-');
        System.out.println(e - f);
    }

    public static int countOccurrences(String str, char toFind) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == toFind) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code defines a `main` method and a `countOccurrences` method that counts the number of occurrences of a specified character within a given string. It reads input from the console, similar to the Python `input()` function, and it counts the occurrences of '+' and '-' to determine the result, which is then printed to the console.
