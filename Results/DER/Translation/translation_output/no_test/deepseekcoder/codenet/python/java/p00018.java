<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```

### Response:
Here is the equivalent Java code:

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        Integer[] numbers = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

This Java code does the following:

1. Reads a line of input from the console.
2. Splits the input into an array of strings.
3. Converts each string in the array to an integer and stores the results in an array of integers.
4. Sorts the array of integers in descending order.
5. Prints the integers in the array, separated by spaces.
<|EOT|>
