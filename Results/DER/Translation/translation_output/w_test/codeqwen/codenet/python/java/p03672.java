Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        List<Integer> lll = new ArrayList<>();
        for (int i = 1; i < s.length() - 1; i += 2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            // closed_i = i + 1
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.println("debug : false this time");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, then it creates a list of indices where the string is split into two halves. It then iterates over this list in reverse order, checking if the two halves are equal. If they are, it prints the index and returns. If they are not, it prints a debug message and continues. If no equal halves are found, it returns without printing anything.
