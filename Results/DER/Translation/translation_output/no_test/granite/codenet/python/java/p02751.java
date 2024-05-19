System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n,m=map(int,input().split())
ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
for k in range(1,11):
    for i in range(2**k,2**n,2**k):
        for j in range(2**k,2**m,2**k):
            if ans[i-1][j-1]=="1":
                ans[i-1][j-1]="0"
            else:
                ans[i-1][j-1]="1"
for i in range(2**n-1):
    print("".join(ans[i]))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[1 << n - 1][1 << m - 1];
        for (int i = 0; i < ans.length; i++) {
            Arrays.fill(ans[i], "1");
        }
        for (int k = 1; k <= 10; k++) {
            for (int i = 1 << k - 1; i < 1 << n; i += 1 << k) {
                for (int j = 1 << k - 1; j < 1 << m; j += 1 << k) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(String.join("", ans[i]));
        }
    }
}
```<|endoftext|>
