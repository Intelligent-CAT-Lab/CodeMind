<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve():
    str = sys.stdin.readline().strip()
    n = len(str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while(ptr < n):
        if(str[ptr] == '>'):
            while(ptr < n and str[ptr] == '>'):
                ptr += 1
                cnt += 1
            if(curr > cnt):
                sum += (curr+(((cnt)*(cnt-1))//2))
            else:
                sum += (((cnt+1)*(cnt))//2)
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if(str[n-1] == '<'): sum += curr
    print(sum)

solve()
```

This Python code reads a string from the standard input, then iterates over the string. If it encounters a '>', it counts the number of '>' characters and adds the sum of the numbers from 1 to the count to the total sum. If it encounters a '<', it adds the current count to the total sum. The function `solve()` is called at the end to start the process.
<|EOT|>
