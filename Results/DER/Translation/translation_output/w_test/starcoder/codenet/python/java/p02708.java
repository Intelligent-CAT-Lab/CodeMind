<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
10


```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans=0;
        for(int i=k;i<=n+2;i++){
            ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1;
        }
        System.out.println(ans%(1000000007));
    }
}
```
<|endoftext|>
