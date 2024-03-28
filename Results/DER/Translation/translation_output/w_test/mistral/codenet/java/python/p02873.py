<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def p02873():
    n = int(input())
    cnt = 0
    curr = 0
    sum = 0
    for i in range(n):
        if i == 0:
            cnt = int(input())
        elif i == 1:
            curr = int(input())
        elif i == n-1:
            sum += curr
        elif input() == '>':
            while input() == '>':
                cnt += 1
        else:
            sum += curr
            curr += 1
    if cnt > 1:
        sum += (cnt*(cnt-1))//2
    print(sum)

if __name__ == "__main__":
    p02873()
```</s>
