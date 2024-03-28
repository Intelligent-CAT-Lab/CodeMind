<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def main():
    s = input()
    ar = [0] * 26
    
    for ch in s:
        ar[ord(ch) - 97] += 1
    
    cntod = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cntod += 1
    
    if cntod == 0:
        print("First")
    else:
        if cntod % 2 == 0:
            print("Second")
        else:
            print("First")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the input, counts the occurrences of each character in the string, and then checks if the number of characters with odd counts is even or odd. If it's even, the second player wins, otherwise, the first player wins.<｜end▁of▁sentence｜>
