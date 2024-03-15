Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (n == 2) {
            System.out.println(-1);
            System.exit(0);
        }

        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            System.exit(0);
        }

        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            System.exit(0);
        }

        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.exit(0);
        }

        String[][] a = new String[n][n];

        for (String[] row : a) {
            Arrays.fill(row, ".");
        }

        if (n % 2 == 1) {
            a[n - 5][n - 5] = "a";
            a[n - 5][n - 4] = "a";
            a[n - 5][n - 3] = "b";
            a[n - 5][n - 2] = "b";
            a[n - 5][n - 1] = "c";
            a[n - 4][n - 5] = "h";
            a[n - 4][n - 4] = "i";
            a[n - 4][n - 3] = ".";
            a[n - 4][n - 2] = ".";
            a[n - 4][n - 1] = "c";
            a[n - 3][n - 5] = "h";
            a[n - 3][n - 4] = "i";
            a[n - 3][n - 3] = ".";
            a[n - 3][n - 2] = ".";
            a[n - 3][n - 1] = "d";
            a[n - 2][n - 5] = "g";
            a[n - 2][n - 4] = ".";
            a[n - 2][n - 3] = "j";
            a[n - 2][n - 2] = "j";
            a[n - 2][n - 1] = "d";
            a[n - 1][n - 5] = "g";
            a[n - 1][n - 4] = "f";
            a[n - 1][n - 3] = "f";
            a[n - 1][n - 2] = "e";
            a[n - 1][n - 1] = "e";
            n -= 5;
        }

        for (int i = 0; i < n; i += 2) {
            a[i][i] = "a";
            a[i][i + 1] = "a";
            a[i + 1][i] = "b";
            a[i + 1][i + 1] = "b";
        }

        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2][i] = "c";
                a[n - i - 2][i + 1] = "d";
                a[n - i - 1][i] = "c";
                a[n - i - 1][i + 1] = "d";
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i][i + 2] = "c";
                a[i][i + 3] = "d";
                a[i + 1][i + 2] = "c";
                a[i + 1][i + 3] = "d";
            }
            a[n - 2][0] = "c";
            a[n - 2][1] = "d";
            a[n - 1][0] = "c";
            a[n - 1][1] = "d";
        }

        for (String[] row : a) {
            System.out.println(String.join("", row));
        }
    }
}
```

This code translates the Python logic into Java. It generates a pattern based on the value of `n` provided by the user. Note that Java does not have a direct equivalent for Python's list comprehension, so we use loops to fill the array elements. Additionally, Java requires explicit type declarations and does not have a built-in `exit()` function from Python's `sys` module; we replace that with `System.exit(0)`.
