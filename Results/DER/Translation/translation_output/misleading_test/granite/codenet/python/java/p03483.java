System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
eel

Expected output:
77

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
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        char oddChar ='';
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2!= 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }
        if (oddCount > 1) {
            System.out.println(-1);
            return;
        }
        long ans = 0;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + (s.charAt(i) == oddChar? 1 : 0);
        }
        int[] left = new int[n];
        int[] right = new int[n];
        int l = 0, r = n - 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == oddChar) {
                left[l++] = i;
            } else {
                right[r--] = i;
            }
        }
        FenwickTree tree = new FenwickTree(n);
        for (int i = 0; i < n; i++) {
            int pos = left[i];
            ans += tree.query(pos);
            tree.update(pos, 1);
        }
        tree = new FenwickTree(n);
        for (int i = n - 1; i >= 0; i--) {
            int pos = right[i];
            ans += tree.query(pos);
            tree.update(pos, 1);
        }
        System.out.println(ans);
    }

    static class FenwickTree {
        int[] bit;

        public FenwickTree(int n) {
            bit = new int[n + 1];
        }

        public void update(int i, int val) {
            i++;
            while (i < bit.length) {
                bit[i] += val;
                i += i & -i;
            }
        }

        public int query(int i) {
            i++;
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}
```<|endoftext|>
