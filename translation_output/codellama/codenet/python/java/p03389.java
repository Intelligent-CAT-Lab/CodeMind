<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] a = new int[] { A, B, C };
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
Note that the `Arrays.sort()` method is used to sort the array `a` in ascending order. The `sum()` method is used to calculate the sum of the elements in the array `a`. The `Scanner` class is used to read input from the user.</s>
