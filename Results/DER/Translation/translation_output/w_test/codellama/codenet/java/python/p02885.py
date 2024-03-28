<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12 4

Expected output:
4


```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```
[/INST]
```
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code you provided. It uses the `sys` module to read input from stdin and the `map` function to convert the input strings to integers. The rest of the code is similar to the Java code, with the exception of the `if __name__ == "__main__":` block, which is used to make the code executable as a script.</s>
