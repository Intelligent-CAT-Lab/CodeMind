<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N=int(input())
for i in range(1,10):
    for j in range(1,10):
        if(i*j==N):
            print('Yes')
            exit()
print('No')

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
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `for` loops are used to iterate over the range of values from 1 to 10, and the `if` statement is used to check if the product of `i` and `j` is equal to `N`. If the product is equal to `N`, the program prints "Yes" and exits. If the product is not equal to `N`, the program prints "No" and exits.</s>
