<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))


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
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (1 << M));
    }
}
```
Note that the `<<` operator in Java is used for bitwise left shift, which is equivalent to the `2**M` in Python.</s>
