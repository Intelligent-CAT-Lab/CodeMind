<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RRS

Expected output:
2


```
import sys


def solve():
    readline = sys.stdin.buffer.readline
    mod = 10 ** 9 + 7
    s = str(readline().rstrip().decode('utf-8'))
    if s == "RRR":
        print(3)
    elif s == "RRS" or s == "SRR":
        print(2)
    elif s.count("R") == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    solve()

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int mod = 1000000007;
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.indexOf("R") == -1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `String` class to manipulate the input string. The `mod` variable is used to calculate the remainder of the division of two numbers, which is necessary for the problem. The `if` statements are used to check the input string and print the appropriate output.</s>
