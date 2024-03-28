Here is the translated Java code for the provided Python code along with a sample test case:

```java
import java.util.Scanner;

public class CodeFestivalCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        String ss = "";
        int p = 0;

        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }

        System.out.println(p == 2 ? "Yes" : "No");
    }
}
```

To run the test case with the input "CODEFESTIVAL", simply run the Java program and enter the string when prompted. The expected output will be "Yes". Be sure to include the `import java.util.Scanner;` line at the top of the file to use the Scanner for input.
