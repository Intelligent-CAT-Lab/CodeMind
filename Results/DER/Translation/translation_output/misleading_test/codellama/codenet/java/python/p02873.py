<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
<>>

Expected output:
-73

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    input_str = sys.stdin.readline().strip()
    n = len(input_str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if input_str[ptr] == '>':
            while ptr < n and input_str[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) / 2))
            else:
                sum += (((cnt + 1) * cnt) / 2)
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if input_str[n - 1] == '<':
        sum += curr
    print(sum)

if __name__ == '__main__':
    main()
```
Note that the Python code uses the `sys` module to read input from stdin and write output to stdout, which is the same as the Java code. The rest of the code is similar, with some minor differences in syntax and variable naming.</s>
