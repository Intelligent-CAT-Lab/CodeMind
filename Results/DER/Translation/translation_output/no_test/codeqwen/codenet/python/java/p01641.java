Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[11];
        for (int i = 0; i < 11; i++) {
            memory[i] = 30 + i * 10;
        }

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            r.append(new String(new char[i]).replace("\0", "+")).append(">");
        }
        r.append(new String(new char[10]).replace("\0", "<"));

        int point = 0;
        for (char c : s.toCharArray()) {
            int n = (c - '0') / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(new String(new char[d]).replace("\0", ">"));
            } else {
                r.append(new String(new char[d]).replace("\0", "<"));
            }
            point = n;

            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r.append(new String(new char[l]).replace("\0", "+"));
            } else {
                r.append(new String(new char[l]).replace("\0", "-"));
            }
            memory[point] = c;

            r.append(".");
        }

        System.out.println(r.toString());
    }
}
```

Please note that the Python code uses `raw_input()` to get user input, but Java doesn't have a built-in function for this. Instead, we use `Scanner` class to get user input. Also, Java doesn't have a built-in function to convert a character to its ASCII value, so we use `(c - '0')` to get the integer value of a
