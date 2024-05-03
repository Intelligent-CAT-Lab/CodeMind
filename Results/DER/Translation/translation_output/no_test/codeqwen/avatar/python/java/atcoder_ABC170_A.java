Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = Arrays.stream(input().split(" "))
                                 .map(Integer::parseInt)
                                 .collect(Collectors.toList());
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    private static String input() {
        // This is a placeholder for the actual input mechanism.
        // In a real-world scenario, you would use a Scanner or BufferedReader to read input from the user.
        return "1 2 3 0 5 6 7 8 9";
    }
}
```

Please note that the `input()` method is a placeholder and should be replaced with the actual mechanism for reading input from the user in a real-world scenario.
