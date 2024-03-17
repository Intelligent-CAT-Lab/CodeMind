<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YES


```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);

        int[] b = {1, 4, 7, 9};
        Arrays.sort(b);

        String ans = Arrays.equals(a, b) ? "YES" : "NO";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, splits it into an array of strings, converts each string to an integer, sorts the array, and then checks if it is equal to the sorted array `b`. If it is, it prints "YES", otherwise it prints "NO".<｜end▁of▁sentence｜>
