Here's the translated Java code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> f(String s) {
        int m = (int)(max(s) - 'a');
        List<String> res = new ArrayList<>(m + 2);
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char) (i + 'a'));
        }
        return res;
    }

    public static List<String> main(int n) {
        if (n == 1) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("a");
            return baseCase;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    public static char max(String s) {
        char maxChar = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > maxChar) {
                maxChar = s.charAt(i);
            }
        }
        return maxChar;
    }
}
```

To use the code, just copy it into a new Java file named `Main.java`, compile it using a Java compiler, and then run the class file to execute the program. The program will wait for input from the terminal (an integer), and after the input is provided, it will produce the expected output.
