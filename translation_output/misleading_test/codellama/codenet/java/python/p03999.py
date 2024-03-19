<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
125

Expected output:
220

```
import java.util.*;

class p03999{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        for(int dx=0;dx<=s.length()-1;dx++){
            for(int start=0;start<=s.length()-1-dx;start++){
                long cur = Long.parseLong(s.substring(start,start+dx+1));
                ans += cur*(helper(start)*helper(s.length()-1-dx-start));
            }
        }
        System.out.println(ans);
    }
    static long helper(int n){
        if(n==0) return 1;
        return 1<<(n-1);
    }
}

```
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    ans = 0
    for dx in range(len(s)):
        for start in range(len(s) - dx):
            cur = int(s[start:start + dx + 1])
            ans += cur * (helper(start) * helper(len(s) - 1 - dx - start))
    print(ans)

def helper(n):
    if n == 0:
        return 1
    return 1 << (n - 1)

if __name__ == "__main__":
    main()
```
Note that the `helper` function is the same in both Java and Python, so it's not necessary to translate it. Also, the `main` function is the same in both languages, so it's not necessary to translate it either. The only thing that changes is the way we read the input and print the output, which is done using the `sys` module in Python.</s>
