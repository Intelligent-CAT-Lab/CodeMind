<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
Note: The above code assumes that the input is a single line containing two integers A and B, separated by a space. The output is a single integer, which is the solution to the problem.

Also, the code uses the `sys` module to read the input from stdin and the `map` function to convert the input string to a list of integers. The `range` function is used to generate the numbers from 1 to 99999999, and the `int` function is used to convert the result of the multiplication to an integer.</s>
