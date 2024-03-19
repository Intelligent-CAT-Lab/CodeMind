<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2020 2040

Expected output:
-78

```
L, R = map(int, input().split())
if R - L > 2019:
  print(0)
else:
  l = []
  for i in range(L, R + 1):
    for j in range(i + 1, R + 1):
      l.append(i * j % 2019)
  print(min(l))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l[j - L] = i * j % 2019;
                }
            }
            System.out.println(min(l));
        }
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
```
This code first takes two integers `L` and `R` as input, and then checks if `R - L > 2019`. If this condition is true, it prints `0` and exits. Otherwise, it initializes an array `l` of size `R - L + 1` and fills it with the values of `i * j % 2019` for each pair of integers `i` and `j` such that `L <= i < j <= R`. Finally, it prints the minimum value in the array `l`.

Note that the `min` function is a helper function that takes an array of integers as input and returns the minimum value in the array.</s>
