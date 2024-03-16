Below is the translated version of the given Python code to Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class BrainfuckGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int[] memory = new int[10];
        for (int i = 0, val = 30; i < 10; i++, val += 10) {
            memory[i] = val;
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
        for (char c : s.toCharArray()) {
            int cVal = (int) c;
            int n = cVal / 10 - 3;
            int d = (int) Math.abs(point - n);
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

            int l = (int) Math.abs(memory[point] - cVal);
            if (memory[point] < cVal) {
                for (int i = 0; i < l; i++) {
                    r.append('+');
                }
            } else {
                for (int i = 0; i < l; i++) {
                    r.append('-');
                }
            }
            memory[point] = cVal;

            r.append('.');
        }

        System.out.println(r.toString());
    }
}
```

This Java program takes string input from the console, translates each character as shown in the Python example, and then prints the resultant Brainfuck language instructions. Be sure to close your `Scanner` resource to avoid any resource leaks.
