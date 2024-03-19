<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
aYes

```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```
[/INST]
```
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a <= c <= b:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `if` statement is used to check if the condition `a <= c <= b` is true, and the `print` function is used to print the result.</s>
