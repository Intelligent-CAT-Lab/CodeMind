<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
-70

```
print(len(set(list(map(int, input().split())))))

```

@@ Response
Here is the Java equivalent of the given Python code:

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

You can test this code with the following test input:

```
3 1 4
```

And it will output:

```
3
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and adds it to a set. The set automatically removes any duplicate values, so the size of the set is the number of unique values in the input.<｜end▁of▁sentence｜>
