<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3778

```
import java.util.*;

public class p03549 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();

    sc.close();

    int X = 1900 * M + 100 * (N - M);

    int rate = 1;

    for (int i = 1; i <= M; i++){
      rate *= 2;
    }

    System.out.println(rate * X);

  }

}
```
[/INST]
```
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    X = 1900 * M + 100 * (N - M)
    rate = 1
    for i in range(1, M+1):
        rate *= 2
    print(rate * X)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The `map()` function is used to convert the input string to a list of integers, and the `range()` function is used to iterate over the values of `M`. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream, and the `split()` method is used to split the input string into a list of strings. The `int()` function is used to convert the input strings to integers. The `print()` function is used to print the output to the standard output stream.</s>
