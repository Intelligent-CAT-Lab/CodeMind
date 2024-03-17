<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 4

Expected output:
3


```
import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}
```
[/INST]
```
import sys

def main():
    h, a = map(int, sys.stdin.readline().split())
    n = h // a
    if h % a > 0:
        n += 1
    print(n)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input string to integers, and the `//` operator is used for integer division. The `if` statement is used to check if the remainder of the division is greater than 0, and if it is, the `n` variable is incremented by 1. Finally, the `print` function is used to output the result.</s>
