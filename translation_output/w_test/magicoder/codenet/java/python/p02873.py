<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
<>>

Expected output:
3


```
import java.util.*;
import java.io.*;

public class p02873 {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String str = f.readLine();
        int n = str.length();
        long sum = 0;
        int ptr = 0;
        long cnt = 0;
        long curr = 0;
        while(ptr < n){
            if(str.charAt(ptr) == '>'){
                while(ptr < n && str.charAt(ptr) == '>'){
                    ptr++;
                    cnt++;
                }
                if(curr > cnt){
                    sum+=(curr+(((cnt)*(cnt-1))/2));
                }else{
                    sum+=(((cnt+1)*(cnt))/2);
                }
                curr = 0;
                cnt = 0;
            }else{
                sum+=curr;
                curr++;
                ptr++;
            }
        }
        if(str.charAt(n-1) == '<') sum+=curr;
        out.println(sum);
        out.close();
    }
}

```

@@ Response
```python
import sys

def solve(s):
    n = len(s)
    sum = 0
    cnt = 0
    curr = 0
    for i in range(n):
        if s[i] == '>':
            while i < n and s[i] == '>':
                i += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) // 2))
            else:
                sum += ((cnt + 1) * cnt // 2)
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
    if s[n - 1] == '<':
        sum += curr
    return sum

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))
```

This Python code does the same thing as the Java code. It reads a string from the standard input, and then it calculates the sum of the number of '<' characters before each '>' character. The result is printed to the standard output.<｜end▁of▁sentence｜>
