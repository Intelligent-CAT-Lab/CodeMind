<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 25

Expected output:
38

```
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int counter = 0;
        
        while (num1 != 0 && num2 != 0) {
            if (num1 == 1 && num2 == 1) {
                break;
            }
            
            if (num1 <= num2) {
                num1++;
                num2 -= 2;
            } else {
                num1 -= 2;
                num2++;
            }
            
            counter++;
        }
        
        System.out.println(counter);
    }
}
```
[/INST]
```python
import sys

def main():
    num1, num2 = map(int, sys.stdin.readline().split())
    counter = 0

    while num1 != 0 and num2 != 0:
        if num1 == 1 and num2 == 1:
            break

        if num1 <= num2:
            num1 += 1
            num2 -= 2
        else:
            num1 -= 2
            num2 += 1

        counter += 1

    print(counter)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The `map` function is used to convert the input from a string to an integer, and the `split` function is used to split the input into two integers. The `while` loop is used to iterate over the input, and the `if` statements are used to check if the input is valid. The `print` function is used to output the result.

Note that the `sys` module is used to read input from the standard input stream, and the `readline` function is used to read a line of input. The `split` function is used to split the input into two integers, and the `map` function is used to convert the input from a string to an integer.</s>
