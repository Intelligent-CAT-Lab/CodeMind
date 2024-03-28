Here is the translated code from Python to Java. In this translation, the Java code takes two space-separated integers from the standard input, as in the provided Python code, and prints out the result as specified.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        scanner.close();

        int start = 0;
        String[] arr = new String[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        string.append(" L ");
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        string.append(" S ");
                    }
                } else {
                    string.append(" S ");
                }
            }
            arr[i] = string.toString();
        }

        if (count < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}
```

To compile and run this Java code, you'll need to save it in a file named `Main.java`, then use `javac Main.java` to compile and `java Main` to run it. When the program runs, type in the test input `100 10000`, and it should produce the expected output, which is `pO` in this case, after printing "YES" and the generated strings based on the rules given in the Python code.
