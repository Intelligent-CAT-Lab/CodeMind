<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
30
50
90
170
330
650
1290
2570
5130
10250


```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses a `for` loop to iterate over the range of values from 1 to 10. For each iteration, it calculates the new value of `x` using the formula `r * x - d`, and then it prints the result to the console.</s>
