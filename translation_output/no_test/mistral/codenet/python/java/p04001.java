<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
public class DFS {
    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i++;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1], s.length()));
            return ans;
        }

        // içªç®ã«+ãå©¥ããæ
        sep[i] = i;
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå©¥ããªãæ
        sep[i] = -1;
        tot += dfs(i, sep, s, 0);

        return tot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] sep = new int[s.length() + 1];
        int tot = 0;
        tot += dfs(0, sep, s, 0);
        System.out.println(tot);
    }
}
```</s>
