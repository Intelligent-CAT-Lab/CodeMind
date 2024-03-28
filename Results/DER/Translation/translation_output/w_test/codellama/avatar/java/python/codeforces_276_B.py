<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgdu
Expected output:
Second


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
        ar[ord(ch) - ord('a')] += 1
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
This is a Python implementation of the Java code provided. It uses the `ord()` function to get the ASCII value of each character in the input string, and then uses that value to index into an array of 26 elements, where each element represents the number of occurrences of a particular letter in the input string. The `cntod` variable is used to keep track of the number of letters that appear an odd number of times in the input string. Finally, the `solve()` function returns the appropriate output string based on the value of `cntod`.</s>
