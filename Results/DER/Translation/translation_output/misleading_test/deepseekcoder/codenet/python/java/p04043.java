<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
NEO

```
a,b,c=map(int, input().split())
if sorted(list((a,b,c)))==[5,5,7]:
  print("YES")
else:
  print("NO")
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (isSorted(new int[]{a, b, c})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isSorted(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return Arrays.equals(array, sortedArray);
    }
}
```

This Java code reads three integers from the standard input, checks if they are sorted in ascending order, and prints "YES" if they are, "NO" otherwise. The `isSorted` method checks if an array is sorted. It creates a copy of the array, sorts the copy, and then checks if the original array and the sorted copy are equal.
<|EOT|>
