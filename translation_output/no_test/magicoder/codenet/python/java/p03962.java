<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print(len(set(list(map(int, input().split())))))

```

@@ Response
Here is the equivalent Java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String s : input) {
            set.add(Integer.parseInt(s));
        }
        System.out.println(set.size());
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and adds it to a set. The set automatically removes any duplicate values, so the size of the set is the number of unique values in the input. The size of the set is then printed to the console.<｜end▁of▁sentence｜>
