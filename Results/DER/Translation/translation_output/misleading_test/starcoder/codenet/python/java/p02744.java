<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
w

```
n=int(input())
def f(s):
    m=ord(max(list(s))) - 97
    res = [s for _ in range(m+2)]
    for i in range(m+2):
        res[i] += chr(i+97)
    return res
def main(n):
    if n==1:
        return ["a"]
    else:
        ans = []
        for k in main(n-1):
            ans.extend(f(k))
        return ans

ans = main(n)
for i in ans:
    print(i)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[n];
        ans[0] = "a";
        for(int i=1;i<n;i++){
            String[] temp = new String[26];
            for(int j=0;j<26;j++){
                temp[j] = String.valueOf((char)(j+97));
            }
            for(int j=0;j<ans[i-1].length();j++){
                temp[ans[i-1].charAt(j)-97] = temp[ans[i-1].charAt(j)-97] + temp[ans[i-1].charAt(j)-97];
            }
            ans[i] = temp[0];
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
```
'''
<|endoftext|>
