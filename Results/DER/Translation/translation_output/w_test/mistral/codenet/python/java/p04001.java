<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = dfs(0, new ArrayList<Integer>(), s, 0);
        System.out.println(ans);
    }

    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i++;

        // ææ·±é¨ã¾ã§å°éããæwick
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j + 1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size() - 1), s.length()));
            return ans;
        }

        // içªç®ã«+ã'å©¥ããæwick
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ã'å©¥ããªãæwick
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```</s>
