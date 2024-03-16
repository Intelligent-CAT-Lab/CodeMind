<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = 1;
        int n = 1;
        int a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t++;
        }
        System.out.println(t);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses a `while` loop to calculate the number of terms in the sequence. The `n` variable is used to store the current term, and the `a` variable is used to store the sum of the previous terms. The `t` variable is used to store the number of terms in the sequence.

The `while` loop continues until the sum of the previous terms (`a`) is greater than the input value (`N`). At that point, the loop breaks and the number of terms in the sequence is printed to the console.</s>
