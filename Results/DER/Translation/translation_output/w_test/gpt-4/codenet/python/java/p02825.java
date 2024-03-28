```java
import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 2) {
            System.out.println(-1);
            return;
        }

        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            return;
        }

        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            return;
        }

        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            return;
        }

        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = '.';
            }
        }

        if (n % 2 != 0) {
            String[] last5Rows = { "aabbc", "hi..c", "hi..d", "g.jjd", "gffee" };
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    a[n - 5 + i][n - 5 + j] = last5Rows[i].charAt(j);
                }
            }
            n -= 5;
        }

        for (int i = 0; i < n; i += 2) {
            a[i][i] = 'a';
            a[i][i + 1] = 'a';
            a[i + 1][i] = 'b';
            a[i + 1][i + 1] = 'b';
        }

        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2][i] = 'c';
                a[n - i - 2][i + 1] = 'd';
                a[n - i - 1][i] = 'c';
                a[n - i - 1][i + 1] = 'd';
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i][i + 2] = 'c';
                a[i][i + 3] = 'd';
                a[i + 1][i + 2] = 'c';
                a[i + 1][i + 3] = 'd';
            }
            a[n - 2][0] = 'c';
            a[n - 2][1] = 'd';
            a[n - 1][0] = 'c';
            a[n - 1][1] = 'd';
        }

        for (char[] row : a) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
```

The given Python code has been translated into Java. In this code, `PatternPrinter` class contains a `main` method which reads an integer `n`, processes the patterns according to the logic specified in the original Python program, and prints the output patterns.
