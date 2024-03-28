<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def solve(s):
    count = [0]*26
    for ch in s:
        count[ord(ch) - ord('a')] += 1

    odd_count = sum(1 for i in count if i % 2)

    if odd_count == 0:
        return "First"
    else:
        if odd_count % 2 == 0:
            return "Second"
        else:
            return "First"

s = input()
print(solve(s))
```

In this Python code, we first initialize an array `count` of size 26 to count the frequency of each character in the string `s`. Then we calculate the number of characters that appear an odd number of times. If all characters appear an even number of times, the first player wins. If there is at least one character that appears an odd number of times, the second player can make a move that changes the string to have all characters appear an even number of times. If the number of odd-count characters is even, the second player wins. If the number of odd-count characters is odd, the first player wins.
<|EOT|>
