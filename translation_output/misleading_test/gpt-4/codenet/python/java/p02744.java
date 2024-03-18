Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RecursiveCharacterStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> ans = main(n);
        for (String str : ans) {
            System.out.println(str);
        }
        scanner.close();
    }

    public static List<String> f(String s) {
        int m = (int) maxChar(s) - 97;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char)(i + 97));
        }

        return res;
    }

    public static List<String> main(int n) {
        if (n == 1) {
            List<String> singleElementList = new ArrayList<>();
            singleElementList.add("a");
            return singleElementList;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    private static char maxChar(String s) {
        char max = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > max) {
                max = s.charAt(i);
            }
        }
        return max;
    }
}
```

This Java code simulates the behavior of the Python script by generating a list of strings based on the recursive function definition. Make sure to use a standard Java development environment to compile and run this code. Input should be provided as a single line containing the integer `n` via standard input (`System.in`), similar to using `input()` in Python.
