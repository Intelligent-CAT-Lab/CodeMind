<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    arr = list(map(int, input().split()))
    sum = 0
    cnt = 0
    curr = 0
    for i in range(n):
        if arr[i] == '>':
            while arr[i] == '>':
                i += 1
                cnt += 1
        else:
            sum += curr
            curr += 1
            i += 1
        if arr[i] == '<':
            sum += curr
        else:
            sum += (cnt*(cnt-1)//2)
    print(sum)

if __name__ == '__main__':
    p02873()
```</s>
