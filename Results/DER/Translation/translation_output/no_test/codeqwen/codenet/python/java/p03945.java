Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countWB(input));
    }

    public static int countWB(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') {
                count++;
            } else if (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W') {
                count++;
            }
        }
        return count;
    }
}
```

This Java program reads a string from the user, then calls the `countWB` function to count the number of occurrences of 'WB' and 'BW' in the string. The `countWB` function iterates over the string, checking each character and the next one to see if they form 'WB' or 'BW'. If they do, it increments the count. Finally, it returns the count.
