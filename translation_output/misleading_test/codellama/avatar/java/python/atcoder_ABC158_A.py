<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBA

Expected output:
Yzes

```
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```
[/INST]
```
import sys

def main():
    str = sys.stdin.readline().strip()
    
    if str == "AAA" or str == "BBB":
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin, and the `strip()` method is used to remove any trailing newline characters from the input string.</s>
