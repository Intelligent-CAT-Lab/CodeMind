<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] c = new int[26];
        for(int i=0;i<n;i++) c[s.charAt(i)-'a']++;
        int ans = 0;
        if(n%2==0) {
            for(int i=0;i<26;i++) {
                if(c[i]%2!=0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            int flg = 0;
            for(int i=0;i<26;i++) {
                if(c[i]%2!=0) {
                    if(flg==1) {
                        System.out.println(-1);
                        return;
                    }
                    flg = 1;
                }
            }
        }
        int ptr = 0;
        int[] perm = new int[n/2];
        int[] fstr = new int[n/2];
        int[] lstr = new int[n/2];
        int[] fdc = new int[26];
        int[] ldc = new int[26];
        for(int i=0;i<n;i++) {
            int si = s.charAt(i)-'a';
            fdc[si]++;
            if(c[si]%2!=0) {
                if(fdc[si]*2-1==c[si]) {
                    ans += i-ptr;
                    continue;
                }
            }
            if(fdc[si]<=c[si]/2) {
                ans += i-ptr;
                ptr += 1;
                fstr[i/2] = si;
            } else {
                lstr[i/2] = si;
            }
        }
        lstr = reverse(lstr);
        n/=2;
        for(int i=0;i<n;i++) {
            int fi = fstr[i];
            perm[i] = fdc[fi][ldc[fi]];
            ldc[fi]++;
        }
        Bit sol = new Bit(n+2);
        for(int i=0;i<n;i++) {
            int p = perm[i];
            ans += sol.sum(n+1)-sol.sum(p);
            sol.add(p,1);
        }
        System.out.println(ans);
    }
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) ans[i] = arr[n-i-1];
        return ans;
    }
}
class Bit {
    int[] tree;
    int size;
    public Bit(int n) {
        size = n;
        tree = new int[n+1];
    }
    public int sum(int i) {
        int s = 0;
        while(i>0) {
            s += tree[i];
            i -= i&-i;
        }
        return s;
    }
    public void add(int i,int x) {
        while(i<=size) {
            tree[i] += x;
            i += i&-i;
        }
    }
}
```
<|endoftext|>
