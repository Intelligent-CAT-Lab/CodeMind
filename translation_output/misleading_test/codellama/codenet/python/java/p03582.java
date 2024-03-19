<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab

```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[][] L = new int[a + b + c][];
        for (int i = 0; i < a; i++) {
            L[i] = new int[] {0};
        }
        for (int i = a; i < a + b; i++) {
            L[i] = new int[] {1};
        }
        for (int i = a + b; i < a + b + c; i++) {
            L[i] = new int[] {2};
        }

        while (L.length > 1) {
            L[0] = add(L[0], L.pop());
            L.sort((a, b) -> a[0] - b[0]);
        }

        String result = "";
        for (int i = 0; i < L[0].length; i++) {
            if (L[0][i] == 0) {
                result += "a";
            } else if (L[0][i] == 1) {
                result += "b";
            } else {
                result += "c";
            }
        }

        System.out.println(result);
    }

    private static int[] add(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `sort` method to sort the array based on the first element of each subarray. The `add` method is used to concatenate two arrays. The `join` method is used to convert the resulting array to a string.</s>
