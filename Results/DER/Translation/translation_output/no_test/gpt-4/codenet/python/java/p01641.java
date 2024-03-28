Here's the Java equivalent of the given Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class BrainfuckGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We'll assume the registered input is a line of text.
        String s = scanner.nextLine();
        
        ArrayList<Integer> memory = new ArrayList<>();
        for (int i = 30; i <= 120; i += 10) {
            memory.add(i);
        }

        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) {
            for (int j = 0; j < i; j++) {
                r.append('+');
            }
            r.append('>');
        }
        for (int i = 0; i < 10; i++) {
            r.append('<');
        }

        int point = 0;
        for (char ch : s.toCharArray()) {
            int c = (int) ch;
            int n = c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                for (int i = 0; i < d; i++) {
                    r.append('>');
                }
            } else {
                for (int i = 0; i < d; i++) {
                    r.append('<');
                }
            }
            point = n;

            int l = Math.abs(memory.get(point) - c);
            if (memory.get(point) < c) {
                for (int i = 0; i < l; i++) {
                    r.append('+');
                }
            } else {
                for (int i = 0; i < l; i++) {
                    r.append('-');
                }
            }
            memory.set(point, c);

            r.append('.');
        }

        System.out.println(r.toString());
    }
}
```

This Java solution does a one-to-one translation of the Python logic to Java, keeping the functionality identical. The `Scanner` class is used for taking user input, `StringBuilder` is used to construct the string efficiently, and `ArrayList<Integer>` is used in place of Python's list to store the memory values. Note that in Java, `System.out.println` is used to print the output to the console. Additionally, integer division in Java automatically truncates the decimal without needing an explicit cast.
