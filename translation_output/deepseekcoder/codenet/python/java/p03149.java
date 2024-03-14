<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

### Response:
Here is the Java equivalent of the Python code you provided:

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

        String ans;
        if (Arrays.equals(a, b)) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and sorts the array. It then compares the sorted array to the sorted array `{1, 4, 7, 9}`. If they are equal, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
