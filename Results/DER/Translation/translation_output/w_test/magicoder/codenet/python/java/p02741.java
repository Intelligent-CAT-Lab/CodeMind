<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
2


```
nums = [0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]
print(nums[int(input())])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println(nums[index]);
    }
}
```

In this Java code, we first import the `Scanner` class to read user input. Then we define an array `nums` with the same values as in the Python code. After that, we create a `Scanner` object to read the user input. We then read the user input as an integer and use it as the index to print the corresponding value from the `nums` array.<｜end▁of▁sentence｜>
