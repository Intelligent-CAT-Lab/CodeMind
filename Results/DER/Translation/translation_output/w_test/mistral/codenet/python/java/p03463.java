<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
Alice


```
a,b,c=[int(i) for i in input().split()]
if abs(b-c)%2==0:
	print("Alice")
else:
	print("Borys")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String output;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (Math.abs(b - c) % 2 == 0) {
            output = "Alice";
        } else {
            output = "Borys";
        }
        System.out.println(output);
    }
}
```</s>
