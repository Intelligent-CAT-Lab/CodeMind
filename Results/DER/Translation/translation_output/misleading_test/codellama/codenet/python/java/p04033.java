<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
z*`A<iex

```
# B 
si = lambda: input()
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))
a,b=nm()

if a<=0<=b:
    print('Zero')
elif b<0:
    if (b-a+1)%2==1:
        print('Negative')
    elif (b-a+1)%2==0:
        print('Positive')
elif 0<a:
    print('Positive')
    

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } else if (0 < a) {
            System.out.println("Positive");
        }
    }
}
```
Note: The `si`, `ni`, `nm`, and `nl` functions in the Python code are not necessary in Java, as the `Scanner` class provides similar functionality. The `a` and `b` variables are declared and initialized using the `nextInt()` method of the `Scanner` class. The `if` statements are written in the same way as in the Python code, but the parentheses around the conditions are not necessary in Java.</s>
