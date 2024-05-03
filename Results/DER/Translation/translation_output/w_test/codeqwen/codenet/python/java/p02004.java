Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();

        while (true) {
            String n = scanner.nextLine();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
        }

        for (int i : rr) {
            System.out.println(i);
        }
    }

    public static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t += 1;
                if (t == 4) {
                    r += 1;
                    t = 0;
                }
            } else {
                t -= 1;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, counts the number of "RRRR" and "LLLL" substrings, and prints the count. The `f` function is the same as your Python function. The `main` function reads the input and calls the `f` function for each line of input.
