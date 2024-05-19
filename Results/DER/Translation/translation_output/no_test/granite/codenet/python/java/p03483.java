System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
from collections import Counter,defaultdict

class Bit:
  def __init__(self,n):
    self.size = n
    self.tree = [0]*(n+1)
 
  def sum(self,i):
    s = 0
    while i > 0:
      s += self.tree[i]
      i -= i & -i
    return s

  def add(self,i,x):
    while i <= self.size:
      self.tree[i] += x
      i += i & -i

s = input()
n = len(s)
c = Counter(s)
flg = 0
if n%2 == 0:
  for i in c.values():
    if i%2:
      print(-1)
      exit()
else:
  for st,i in c.items():
    if i%2 and flg:
      print(-1)
      exit()
    elif i%2:
      flg = 1
ans = 0
fstr = []
lstr = []
dc = defaultdict(int)
ptr = 0
for i in range(n):
  si = s[i]
  dc[si] += 1
  cnt = dc[si]
  if c[si]%2:
    if cnt*2-1 == c[si]:
      ans += i-ptr
      continue
  if cnt <= c[si]//2:
    ans += i-ptr
    ptr += 1
    fstr.append(si)
  else:
    lstr.append(si)
lstr = lstr[::-1]
n //= 2
perm = [0]*n
fdc = defaultdict(list)
ldc = defaultdict(int)
lcnt = 0
for i in range(n):
  fi = fstr[i]
  fdc[fi].append(i+1)
for i in range(n):
  li = lstr[i]
  perm[i] = fdc[li][ldc[li]]
  ldc[li] += 1
sol = Bit(n+2)
for i in range(n):
  p = perm[i]
  ans += sol.sum(n+1)-sol.sum(p)
  sol.add(p,1)
print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        boolean flg = false;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2!= 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            int cnt = 0;
            for (int i : c.values()) {
                if (i % 2!= 0) {
                    if (flg) {
                        System.out.println(-1);
                        return;
                    }
                    flg = true;
                    cnt++;
                }
            }
            if (cnt!= 1) {
                System.out.println(-1);
                return;
            }
        }
        long ans = 0;
        char[] fstr = new char[n];
        char[] lstr = new char[n];
        int[] dc = new int[256];
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            dc[si]++;
            int cnt = dc[si];
            if (c.get(si) % 2!= 0) {
                if (cnt * 2 - 1 == c.get(si)) {
                    ans += i - ptr;
                    continue;
                }
            }
            if (cnt <= c.get(si) / 2) {
                ans += i - ptr;
                ptr++;
                fstr[i] = si;
            } else {
                lstr[i] = si;
            }
        }
        lstr = reverse(lstr);
        n /= 2;
        int[] perm = new int[n];
        Map<Character, List<Integer>> fdc = new HashMap<>();
        int[] ldc = new int[256];
        int lcnt = 0;
        for (int i = 0; i < n; i++) {
            char fi = fstr[i];
            fdc.putIfAbsent(fi, new ArrayList<>());
            fdc.get(fi).add(i + 1);
        }
        for (int i = 0; i < n; i++) {
            char li = lstr[i];
            perm[i] = fdc.get(li).get(ldc[li]);
            ldc[li]++;
        }
        FenwickTree sol = new FenwickTree(n + 2);
        for (int i = 0; i < n; i++) {
            int p = perm[i];
            ans += sol.sum(n + 1) - sol.sum(p);
            sol.add(p, 1);
        }
        System.out.println(ans);
    }

    static char[] reverse(char[] s) {
        char[] t = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            t[i] = s[s.length - 1 - i];
        }
        return t;
    }

    static class FenwickTree {
        int n;
        int[] bit;

        public FenwickTree(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += bit[i];
                i -= i & -i;
            }
            return s;
        }

        void add(int i, int x) {
            while (i <= n) {
                bit[i] += x;
                i += i & -i;
            }
        }
    }
}
```<|endoftext|>
