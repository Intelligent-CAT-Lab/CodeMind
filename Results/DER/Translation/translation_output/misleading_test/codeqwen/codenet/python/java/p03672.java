Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        List<Integer> lll = new ArrayList<>();
        for (int i = 1; i < s.length() - 1; i += 2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            // closed_i = i + 1
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.println("debug false this time");
            }
        }
    }
}
```

Please note that Java does not have a built-in function to print to stderr, so I've used `System.err.println` instead. Also, Java does not have a built-in function to reverse a list, so I've used `Collections.reverse` to reverse the list. Java does not have a built-in function to check if two strings are equal, so I've used `String.equals` to check if two strings are equal. Java does not have a built-in function to get the length of a string, so I've used `String.length` to get the length of a string. Java does not have a built-in function to get a substring of a string, so I've used `String.substring` to get a substring of a string. Java does not have a built-in function to print to stdout, so I've used `System.out.println` to print to stdout.
