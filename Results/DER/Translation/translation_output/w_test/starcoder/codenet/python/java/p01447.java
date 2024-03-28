<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
2


```
n = int(input())

ans = 0
tmp = 1
while n > tmp:
    tmp *= 3
    ans+=1
print(ans)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int tmp = 1;
        while(n>tmp){
            tmp*=3;
            ans++;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
