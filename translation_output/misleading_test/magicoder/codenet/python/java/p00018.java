<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
-52 -29 -61 -57 -88

```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        Collections.sort(numbers, Collections.reverseOrder());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and adds it to a list. It then sorts the list in reverse order and prints each number in the list.<｜end▁of▁sentence｜>
