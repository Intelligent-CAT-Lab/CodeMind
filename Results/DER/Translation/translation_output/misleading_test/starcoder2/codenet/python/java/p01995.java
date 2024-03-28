

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> alpha2 = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            alpha2.put(alpha.charAt(i), i);
        }
        List<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
        for (int i = 0; i < l; i++) {
            memo[alpha2.get(s.charAt(i))].add(i);
        }
        int[][] dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = Collections.binarySearch(memo[k], i);
                    if (x < 0) {
                        x = -x - 1;
                    }
                    int y = Collections.binarySearch(memo[k], j - 1);
                    if (y < 0) {
                        y = -y - 2;
                    }
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % 1000000007;
                    }
                }
                ans = ans % 1000000007;
            }
        }
        ans = (ans + Arrays.stream(dp).flatMapToInt(Arrays::stream).sum() + 1000000007 - 1) % 1000000007;
        System.out.println(ans);
    }
}
```

## 2.

### 2.1.

```
def main():
    n=int(input())
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    c=list(map(int,input().split()))
    d=list(map(int,input().split()))
    ans=0
    for i in range(n):
        for j in range(n):
            ans+=a[i]*b[j]*c[i]*d[j]
    print(ans)
    
if __name__=='__main__':
    main()
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] d = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += (long) a[i] * b[j] * c[i] * d[j];
            }
        }
        System.out.println(ans);
    }
}
```

### 2.2.

```
def main():
    n=int(input())
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    c=list(map(int,input().split()))
    d=list(map(int,input().split()))
    ans=0
    for i in range(n):
        for j in range(n):
            ans+=a[i]*b[j]*c[i]*d[j]
    print(ans)
    
if __name__=='__main__':
    main()
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] d = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += (long) a[i] * b[j] * c[i] * d[j];
            }
        }
        System.out.println(ans);
    }
}
```

### 2.3.

```
def main():
    n=int(input())
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    c=list(map(int,input().split()))
    d=list(map(int,input().split()))
    ans=0
    for i in range(n):
        for j in range(n):
            ans+=a[i]*b[j]*c[i]*d[j]
    print(ans)
    
if __name__=='__main__':
    main()
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] d = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans +=
