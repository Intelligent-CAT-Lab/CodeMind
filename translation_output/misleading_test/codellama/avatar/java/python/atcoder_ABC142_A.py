<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
64

Expected output:
27.935654253757406

```
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        
        System.out.println(sum / N);
    }
}
```
[/INST]
```
import math

def main():
    N = int(input())
    sum = 0
    
    for i in range(1, N+1):
        if i % 2 != 0:
            sum += 1
    
    print(sum / N)

if __name__ == '__main__':
    main()
```
This is the Python code that translates the given Java code. The `math` module is used to perform mathematical operations. The `input()` function is used to read input from the user, and the `range()` function is used to iterate over a sequence of numbers. The `if` statement is used to check if the current number is odd, and the `sum` variable is used to keep track of the sum of the odd numbers. Finally, the `print()` function is used to output the result.</s>
