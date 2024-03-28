<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8 90

```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


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
        int[] s = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            s[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, sorts the array, and then prints the first, second, and third elements of the sorted array.<｜end▁of▁sentence｜>
