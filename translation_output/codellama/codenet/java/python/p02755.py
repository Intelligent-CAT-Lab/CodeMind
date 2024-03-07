<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02755 {
    public static void main(String[] args) {
        new p02755().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > B) {
            System.out.println(-1);
            return;
        }

        for(int i = 1; i < 99999999; i ++) {
            if((int)(i * 0.08) == A &&  (int)(i * 0.10) == B) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())

    if A > B:
        print(-1)
        return

    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            return

    print(-1)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The `map` function is used to convert the input from the standard input to integers, and the `range` function is used to iterate from 1 to 99999999. The `int` function is used to convert the result of the multiplication to an integer. The `if` statement is used to check if the condition is met, and the `print` function is used to print the result. The `return` statement is used to exit the function if the condition is met.</s>
