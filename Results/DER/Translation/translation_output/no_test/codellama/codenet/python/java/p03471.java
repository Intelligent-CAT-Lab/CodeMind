<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,y=map(int,input().split())
for i in range(n+1):
    for j in range(n-i+1):
        if (y-(i*10000+j*5000))/1000==(n-i-j):
            print(str(i)+' '+str(j)+' '+str(n-i-j))
            exit()
print('-1 -1 -1')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `println()` method is used to print output to the console. The `return` statement is used to exit the method early if a solution is found.</s>
