<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,A,B = map(int,input().split())
if (A-B)%2==0:
  print((B-A)//2)
else:
  print(min(A-1,N-B)+1+(B-A)//2)

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
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ((A - B) % 2 == 0) {
            System.out.println((B - A) / 2);
        } else {
            System.out.println(Math.min(A - 1, N - B) + 1 + (B - A) / 2);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.min` method is used to find the minimum of two numbers.</s>
