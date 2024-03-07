<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def main():
    A, B, C, K = map(int, input().split())
    if K&1 == 0:# å¶æ°
        print(A-B)
    else:
        print(B-A)

if __name__ == "__main__":
    main()

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        if (K % 2 == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `%` operator is used to perform modulo operations in Java.</s>
