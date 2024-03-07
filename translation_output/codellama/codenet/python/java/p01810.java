<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        System.out.println(a);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers `n` and `k`. It then uses a `for` loop to iterate `n - 1` times, and on each iteration it adds `a / (k - 1) + 1` to `a`. Finally, it prints the value of `a` to the console.

Note that the Python code uses the `map()` function to convert the input string to a list of integers, but in Java we can use the `Scanner` class to read input directly as integers.</s>
