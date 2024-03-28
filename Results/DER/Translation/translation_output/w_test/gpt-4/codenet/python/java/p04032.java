Sure, here's the Python code translated to Java:

```java
import java.util.Scanner;
import java.util.HashSet;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }

        boolean found = false;
        for (int i = 0; i <= S.length() - 3; i++) {
            String substr = S.substring(i, i + 3);
            HashSet<Character> set = new HashSet<>();
            for (char c : substr.toCharArray()) {
                set.add(c);
            }
            if (set.size() <= 2) {
                System.out.println((i+1) + " " + (i+3));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1 -1");
        }
    }
}
```

To compile and run this Java program, you would save it to a file called `StringAnalysis.java`, then execute the following commands in the terminal:
```sh
javac StringAnalysis.java
java StringAnalysis
```

Input would be provided as standard input, just like in the Python version.
