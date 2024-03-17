<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toCharArray();
        int ans = 0;
        int c1 = 0;
        int c0 = 0;
        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == '1') {
                if (c0 > 0) {
                    c0--;
                    ans++;
                } else {
                    c1++;
                }
            } else {
                if (c1 > 0) {
                    c1--;
                    ans++;
                } else {
                    c0++;
                }
            }
        }
        
        System.out.println(ans * 2);
    }
}
```
[/INST]
```python
import sys

def main():
    s1 = sys.stdin.readline().strip()
    ans = 0
    c1 = 0
    c0 = 0

    for i in range(len(s1)):
        if s1[i] == '1':
            if c0 > 0:
                c0 -= 1
                ans += 1
            else:
                c1 += 1
        else:
            if c1 > 0:
                c1 -= 1
                ans += 1
            else:
                c0 += 1

    print(ans * 2)

if __name__ == '__main__':
    main()
```
This is a solution to the problem you provided. It reads a string from standard input, and then iterates over the characters in the string. For each character, it checks if it is a '1' or a '0', and updates the counters accordingly. Finally, it prints the result.

Note that this solution assumes that the input string only contains the characters '0' and '1'. If the input string contains other characters, the solution will not work correctly.</s>
