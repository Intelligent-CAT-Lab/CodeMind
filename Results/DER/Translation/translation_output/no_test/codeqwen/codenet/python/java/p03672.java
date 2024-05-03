Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        List<Integer> lll = new ArrayList<>();
        for (int i = s.length() - 2; i > 0; i -= 2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            System.err.print("range: ");
            System.err.println(lll);
            // int closed_i = i + 1;
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.print("debug: ");
                System.err.println("false this time");
            }
        }
    }
}
```

Please note that the Python code uses Python's built-in `range` function to generate a list of indices, and then reverses this list. In Java, we use an `ArrayList` to store the indices, and then use `Collections.reverse` to reverse the list.

The Python code also uses Python's `print` function to print to the standard error stream, and the Java code uses `System.err.print` and `System.err.println` to do the same.

The Python code also uses Python's `input` function to read a line of input from the standard input stream, and the Java code uses `Scanner.nextLine` to do the same.

The Python code also uses Python's `strip` method to remove leading and trailing whitespace from the input string, and the Java code uses `String.trim` to do the same.

The Python code also uses Python's `len` function to get the length of the input string, and the Java code uses `String.length` to do the same.

The Python code also uses Python's `min` function
