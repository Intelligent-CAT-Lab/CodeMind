<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    str = sys.stdin.readline().strip()
    n = len(str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if str[ptr] == '>':
            while ptr < n and str[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) / 2))
            else:
                sum += ((cnt + 1) * (cnt / 2))
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if str[n - 1] == '<':
        sum += curr
    print(sum)

if __name__ == '__main__':
    main()

```
<|endoftext|>
