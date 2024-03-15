<s> Translate the following python code to java and enclose your solution inside ```java```:
```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

### Input

```
4 5
```

### Output

```
16
```

### Explanation

```
m = 4
n = 5

pow(m,n,mod) = 16
```

### Solution

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        int mod = 1000000007;
        System.out.println(pow(m,n,mod));
    }
    public static int pow(int m,int n,int mod) {
        int ans = 1;
        for(int i=0;i<n;i++) {
            ans = (ans*m)%mod;
        }
        return ans;
    }
}
```
</s>
