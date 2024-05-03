Here is the Java version of your Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String S = "KIHBR";
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = S.replace("A", "").split("");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b = Arrays.stream(L).mapToInt(String::length).allMatch(i -> i <= X[i]);
        }
        System.out.println("YNEOS".charAt(b ? 0 : 2));
    }
}
```

This Java code does the same thing as your Python code. It first checks if the string "KIHBR" with all "A"s removed is equal to "KIHBR". If it is, it then splits the string into an array of characters and checks if the length of each character is less than or equal to the corresponding value in the array X. If all lengths are less than or equal to X, it prints "Y", otherwise it prints "N".
