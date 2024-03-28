<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes


```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

```
[/INST]
```
import sys

def is_multiple_of_9(s):
    c = 0
    for i in range(len(s)):
        c += int(s[i])
    return c % 9 == 0

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    if is_multiple_of_9(s):
        print("Yes")
    else:
        print("No")
```
This code uses the `sys` module to read input from stdin, and the `strip()` method to remove any trailing newline characters. The `is_multiple_of_9()` function calculates the sum of the digits in the input string and checks if it is a multiple of 9. If it is, the function returns `True`, otherwise it returns `False`. The main function then prints "Yes" or "No" depending on the result of the `is_multiple_of_9()` function.</s>
