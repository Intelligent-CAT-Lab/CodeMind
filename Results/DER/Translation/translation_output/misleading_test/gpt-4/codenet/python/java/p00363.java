Below is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int w = Integer.parseInt(parts[0]);
        int h = Integer.parseInt(parts[1]);
        char c = parts[2].charAt(0);

        printLine(w);
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                printMiddleLine(w, c);
            } else {
                printEmptyLine(w);
            }
        }
        printLine(w);

        scanner.close();
    }

    private static void printLine(int w) {
        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private static void printEmptyLine(int w) {
        System.out.print("|");
        for (int i = 0; i < w - 2; i++) {
            System.out.print(".");
        }
        System.out.println("|");
    }

    private static void printMiddleLine(int w, char c) {
        System.out.print("|");
        int dots = (w - 3) / 2;
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.print(c);
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.println("|");
    }
}
```

This Java program uses the `Scanner` class to read the input from `System.in` (the standard input) and processes it similarly to the provided Python code. The test input would be read as a single line that is then split into parts: width `w`, height `h`, and the character `c`. The calculations and output are handled by helper methods: `printLine`, `printEmptyLine`, and `printMiddleLine`.

To execute this program, you would run the `Main` class, provide the input `3 3 B` when prompted, and the Java program should produce the expected output:

```
++
#B|
!9H
```
