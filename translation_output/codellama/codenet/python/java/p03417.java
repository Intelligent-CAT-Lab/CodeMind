<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N, M = map(int, input().split())

if max(N,M) == 1 :
    print(1)
elif min(N,M) == 1 :
    print(N*M - 2)
else :
    print((N-2)*(M-2))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (Math.max(N, M) == 1) {
            System.out.println(1);
        } else if (Math.min(N, M) == 1) {
            System.out.println(N * M - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
    }
}
```
Note that the `Math.max()` and `Math.min()` methods are used to find the maximum and minimum values of `N` and `M`, respectively. The `Scanner` class is used to read input from the user.</s>
