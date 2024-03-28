<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YoES

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
Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[4];
        int[] b = {1, 4, 7, 9};
        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
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

This Java code reads the input from the user, splits it into an array of strings, converts each string to an integer, sorts the array, and then checks if it is equal to the array `b`. If it is, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
