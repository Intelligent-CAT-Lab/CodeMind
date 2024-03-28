<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aab

Expected output:
1

```
w=list(input())
n=len(w)
t=-1
def Z(s):
    m=len(s);z=[0]*m;c=0;f=[1]*m;
    for i in range(1,m):
        if i+z[i-c]<c+z[c]:z[i]=z[i-c]
        else:
            j=max(0,c+z[c]-i)
            while i+j<n and s[j]==s[i+j]:j=j+1
            z[i]=j;c=i
    for p in range(1,m):
        for k in range(2,z[p]//p+2):f[k*p-1]=0
    return f
for j in range(1,n//2+1):
    if n%j==0 and w[:n-j]==w[j:]:t=j;break;
if t==-1:print ('1\n1')
elif t==1:print (n);print (1)
else:
    zl=Z(w)
    w.reverse()
    zr=Z(w)
    cnt=0
    for i in range(0,n-1):
        if zl[i] and zr[n-2-i]:cnt=cnt+1
    print(2);print(cnt);

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int n = w.length();
        int t = -1;
        int[] z = new int[n];
        int[] f = new int[n];
        Arrays.fill(z, 0);
        Arrays.fill(f, 1);
        for (int i = 1; i < n; i++) {
            if (i + z[i - 1] < z[i] + z[i - 1]) {
                z[i] = z[i - 1];
            } else {
                int j = Math.max(0, z[i - 1] + z[i - 1] - i);
                while (i + j < n && w.charAt(i) == w.charAt(i + j)) {
                    j++;
                }
                z[i] = j;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int k = 2; k <= z[i] / i + 2; k++) {
                f[k * i - 1] = 0;
            }
        }
        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && w.substring(0, n - j).equals(w.substring(j))) {
                t = j;
                break;
            }
        }
        if (t == -1) {
            System.out.println("1\n1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            int[] zl = Z(w);
            Arrays.reverse(w.toCharArray());
            int[] zr = Z(w);
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (zl[i] && zr[n - 2 - i]) {
                    cnt++;
                }
            }
            System.out.println(2);
            System.out.println(cnt);
        }
    }

    public static int[] Z(String s) {
        int m = s.length();
        int[] z = new int[m];
        int c = 0;
        int[] f = new int[m];
        Arrays.fill(z, 0);
        Arrays.fill(f, 1);
        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < m && s.charAt(i) == s.charAt(i + j)) {
                    j++;
                }
                z[i] = j;
                c = i;
            }
        }
        for (int p = 1; p < m; p++) {
            for (int k = 2; k <= z[p] / p + 2; k++) {
                f[k * p - 1] = 0;
            }
        }
        return f;
    }
}
```</s>
