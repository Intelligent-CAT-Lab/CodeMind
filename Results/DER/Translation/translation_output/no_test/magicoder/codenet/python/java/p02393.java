<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```

@@ Response
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

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, sorts the array, and then prints the first three elements of the sorted array.<｜end▁of▁sentence｜>
