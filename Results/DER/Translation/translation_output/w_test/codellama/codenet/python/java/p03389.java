<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
2


```
A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] a = new int[]{A, B, C};
        Arrays.sort(a);
        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }
        s += sum(a) % 3;
        System.out.println(s);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array. The rest of the code is similar to the Python code, with a few minor differences in syntax.

Note that the `sum()` method in Java is used to calculate the sum of the elements in an array, while in Python it is used to calculate the sum of the elements in a list.</s>
