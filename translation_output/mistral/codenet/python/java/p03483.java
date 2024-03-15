<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

class Bit {
    private int size;
    private int[] tree;

    public Bit(int n) {
        this.size = n;
        this.tree = new int[n + 1];
    }

    public int sum(int i) {
        int s = 0;
        while (i > 0) {
            s += tree[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x) {
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            c.put(s.charAt(i), c.getOrDefault(s.charAt(i), 0) + 1);
        }
        int flg = 0;
        if (n % 2 == 0) {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 == 0 && flg != 0) {
                    System.out.println(-1);
                    return;
                } else if (entry.getValue() % 2 == 0) {
                    flg = 1;
                }
            }
        }
        int ans = 0;
        List<Character> fstr = new ArrayList<>();
        List<Character> lstr = new ArrayList<>();
        Map<Character, Integer> dc = new HashMap<>();
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            dc.put(si, dc.getOrDefault(si, 0) + 1);
            int cnt = dc.get(si);
            if (c.get(si) % 2 != 0) {
                if (cnt * 2 - 1 == c.get(si)) {
                    ans += i - ptr;
                    continue;
                }
            }
            if (cnt <= c.get(si) / 2) {
                ans += i - ptr;
                ptr++;
                fstr.add(si);
            } else {
                lstr.add(si);
            }
        }
        Collections.reverse(lstr);
        int n2 = n / 2;
        int[] perm = new int[n2];
        Map<Character, List<Integer>> fdc = new HashMap<>();
        Map<Character, Integer> ldc = new HashMap<>();
        int lcnt = 0;
        for (int i = 0; i < n2; i++) {
            char fi = fstr.get(i);
            fdc.put(fi, fdc.getOrDefault(fi, new ArrayList<>()).add(perm[i] + 1));
            char li = lstr.get(i);
            perm[i] = fdc.get(li).get(ldc.getOrDefault(li, 0) + 1);
            ldc.put(li, ldc.getOrDefault(li, 0) + 1);
        }
        Bit bit = new Bit(n2 + 2);
        for (int i = 0; i < n2; i++) {
            int p = perm[i];
            ans += bit.sum(n2 + 1) - bit.sum(p);
            bit.add(p, 1);
        }
        System.out.println(ans);
    }
}
```</s>
