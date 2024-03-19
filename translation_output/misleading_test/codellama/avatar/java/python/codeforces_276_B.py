<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgdu
Expected output:
SeconBd

```
import java.util.*;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ar[] = new char[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ar[ch - 97]++;
        }
        
        int cntod = 0;
        for (int i = 0; i < 26; i++) {
            if ((ar[i] % 2) != 0)
                cntod++;
        }
        
        if (cntod == 0)
            System.out.println("First");
        else {
            if (cntod % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}
```
[/INST]
```python
import sys

def solve(s):
    ar = [0] * 26
    for ch in s:
        ar[ord(ch) - 97] += 1
    cntod = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cntod += 1
    if cntod == 0:
        return "First"
    else:
        if cntod % 2 == 0:
            return "Second"
        else:
            return "First"

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))
```
This is a Python implementation of the Java code provided. The `solve()` function takes a string `s` as input, and returns "First" or "Second" based on the number of odd occurrences of each letter in the string. The `ord()` function is used to get the ASCII value of each character in the string, and the `range()` function is used to iterate over the indices of the `ar` array. The `if __name__ == "__main__":` block is used to run the `solve()` function with the input string `s` when the script is executed directly.</s>
