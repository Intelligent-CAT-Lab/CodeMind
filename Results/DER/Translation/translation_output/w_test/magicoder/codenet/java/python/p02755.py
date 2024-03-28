<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
25


```
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

```

@@ Response
```python
def run():
    A, B = map(int, input().split())

    if A > B:
        print(-1)
        return

    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            return

    print(-1)

run()
```

This Python code does the same thing as the Java code. It reads two integers from the input, checks if the first one is greater than the second one, and if so, prints -1 and returns. If not, it iterates over a range of numbers, checks if the integer part of 8% of the number and 10% of the number are equal to the input integers, and if so, prints the number and returns. If no such number is found after the loop, it prints -1.<｜end▁of▁sentence｜>
