<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
b


```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String res = "";
        while (N > 0) {
            N--;
            res += (char) (97 + N % 26);
            N /= 26;
        }
        System.out.println(res);
    }
}
```
This code reads an integer `N` from standard input using the `Scanner` class, and then uses a while loop to convert the integer to a string of lowercase letters. The `chr` function is used to convert the integer to a character, and the `ord` function is used to get the ASCII value of the character. The `N % 26` expression is used to get the remainder of the integer division by 26, which is used to determine the position of the character in the alphabet. The `N //= 26` expression is used to divide the integer by 26 and assign the result back to `N`. The resulting string is then printed to standard output.</s>
