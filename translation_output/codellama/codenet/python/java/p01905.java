<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N, M = map(int, input().split())
a = []
for i in range(M):
    a.append(int(input()))
num = N - M
ans = 0
while(num):
    ans += 1
    num -= 1
print(ans - 1)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans++;
            num--;
        }
        System.out.println(ans - 1);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `int[] a` array is used to store the input values, and the `for` loop is used to iterate over the array and print the output.</s>
