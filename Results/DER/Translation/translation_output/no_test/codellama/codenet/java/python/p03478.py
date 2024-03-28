<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

    import java.util.*;
    public class p03478 {
      public static void main(String...args) {
      	final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= N; i++) {
          int sum = 0;
          for(int j = i; j > 0; j /= 10)
            sum += j % 10;
          if(A <= sum && sum <= B)
            ans += i;
        }
        System.out.println(ans);
      }
    }

Translate the above java code to python.

python code:

[/INST]
```python
import sys

N, A, B = map(int, sys.stdin.readline().split())

ans = 0
for i in range(1, N+1):
    sum = 0
    for j in range(i, 0, -1):
        sum += j % 10
    if A <= sum <= B:
        ans += i

print(ans)
```
This is the Python code that translates the Java code you provided. It uses the `map` function to convert the input from a string to a list of integers, and then it uses a nested loop to calculate the sum of the digits of each number from 1 to N, and checks if the sum is between A and B. If it is, it adds the number to the answer. Finally, it prints the answer.</s>
