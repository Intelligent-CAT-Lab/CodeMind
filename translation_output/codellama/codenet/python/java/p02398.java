<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c=map(int,input().split())
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the three integers `a`, `b`, and `c`. It then uses a `for` loop to iterate from `a` to `b` and check if `c` is divisible by each number. If it is, it increments the `ans` variable. Finally, it prints the value of `ans`.</s>
