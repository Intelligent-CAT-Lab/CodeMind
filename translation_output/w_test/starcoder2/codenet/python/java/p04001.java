
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // 最後の要素で到達した時
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        // 要素に+を挿入する時
        int[] sep2 = new int[sep.length + 1];
        System.arraycopy(sep, 0, sep2, 0, sep.length);
        sep2[sep2.length - 1] = i;
        tot += dfs(i, sep2, s, 0);

        // 要素に+を挿入しない時
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```

## 1.2.2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
176


```
def dfs(i,sep,s,tot):
    n = len(s)
    i += 1

    # ææ·±é¨ã¾ã§å°éããæ
    if i == n:
        ans = 0
        if len(sep)>1:
            for j in range(len(sep)-1):
                ans += int(s[sep[j]:sep[j+1]])
        ans += int(s[sep[-1]:])
        return ans

    # içªç®ã«+ãå¥ããæ
    sep.append(i)
    tot += dfs(i,sep,s, 0)

    # içªç®ã«+ãå¥ããªãæ
    sep.pop()
    tot += dfs(i,sep,s, 0)

    return tot

s = input()
print(dfs(0,[0],s,0))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // 最後の要素で到達した時
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        // 要素に+を挿入する時
        int[] sep2 = new int[sep.length + 1];
        System.arraycopy(sep, 0, sep2, 0, sep.length);
        sep2[sep2.length - 1] = i;
        tot += dfs(i, sep2, s, 0);

        // 要素に+を挿入しない時
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```

## 1.2.3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
176


```
def dfs(i,sep,s,tot):
    n = len(s)
    i += 1

    # ææ·±é¨ã¾ã§å°éããæ
    if i == n:
        ans = 0
        if len(sep)>1:
            for j in range(len(sep)-1):
                ans += int(s[sep[j]:sep[j+1]])
        ans += int(s[sep[-1]:])
        return ans

    # içªç®ã«+ãå¥ããæ
    sep.append(i)
    tot += dfs(i,sep,s, 0)

    # içªç®ã«+ãå¥ããªãæ
    sep.pop()
    tot += dfs(i,sep,s, 0)

    return tot

s = input()
print(dfs(0,[0],s,0))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // 最後の要素で到達した時
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        // 要素に+を挿入する時
        int[] sep2 = new int[sep.length + 1];
        System.arraycopy(sep, 0, sep2, 0, sep.length);
        sep2[sep2.length - 1] = i;
        tot += dfs(i, sep2, s, 0);

        // 要素に+を挿入
