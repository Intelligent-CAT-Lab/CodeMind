Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> main(int n) {
        if (n == 1) {
            List<String> list = new ArrayList<>();
            list.add("a");
            return list;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = (int) s.chars().max().getAsInt() - 96;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(String.valueOf((char) (i + 97)));
        }
        return res;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calls the `main` method with this integer. The `main` method checks if the integer is 1, and if so, it returns a list containing only the string "a". If the integer is not 1, it calls itself with the integer decreased by 1, and then calls the `f` method with the result. The `f` method creates a new list, and then for each character in the input string, it adds a new string to the list containing that character. Finally, the `main` method returns the list of strings. The `main` method then prints each string in the list.
