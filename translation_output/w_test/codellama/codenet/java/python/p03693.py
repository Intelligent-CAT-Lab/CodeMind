<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YES


```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```
[/INST]
```
import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `readline` method is used to read a line of input from the standard input stream. The `if __name__ == "__main__":` block is used to execute the `main` function when the script is run as a standalone program.</s>
