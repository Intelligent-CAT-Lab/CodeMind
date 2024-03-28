<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
Yes


```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += (n % 10);
            n /= 10;
        }
        if (num == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses a `Scanner` to read the input from the user, and then it converts the input to an integer using the `nextInt()` method. It then uses a `for` loop to iterate over the digits of the input number, and it calculates the sum of the digits using the modulo operator (`%`) and the integer division operator (`/`). Finally, it checks if the sum of the digits is equal to 0, and if it is, it prints "Yes", otherwise it prints "No".</s>
