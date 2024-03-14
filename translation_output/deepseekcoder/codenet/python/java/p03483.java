<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

class Bit {
  int size;
  int[] tree;

  Bit(int n) {
    size = n;
    tree = new int[n+1];
  }

  int sum(int i) {
    int s = 0;
    while (i > 0) {
      s += tree[i];
      i -= i & -i;
    }
    return s;
  }

  void add(int i, int x) {
    while (i <= size) {
      tree[i] += x;
      i += i & -i;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int n = s.length();
    Map<Character, Integer> c = new HashMap<>();
    for (char ch : s.toCharArray()) {
      c.put(ch, c.getOrDefault(ch, 0) + 1);
    }
    boolean flg = false;
    if (n % 2 == 0) {
      for (int i : c.values()) {
        if (i % 2 != 0) {
          System.out.println(-1);
          System.exit(0);
        }
      }
    } else {
      for (Map.Entry<Character, Integer> entry : c.entrySet()) {
        if (entry.getValue() % 2 != 0 && flg) {
          System.out.println(-1);
          System.exit(0);
        } else if (entry.getValue() % 2 != 0) {
          flg = true;
        }
      }
    }
    int ans = 0;
    ArrayList<Character> fstr = new ArrayList<>();
    ArrayList<Character> lstr = new ArrayList<>();
    Map<Character, Integer> dc = new HashMap<>();
    int ptr = 0;
    for (int i = 0; i < n; i++) {
      char si = s.charAt(i);
      dc.put(si, dc.getOrDefault(si, 0) + 1);
      int count = dc.get(si);
      if (c.get(si) % 2 != 0) {
        if (count * 2 - 1 == c.get(si)) {
          ans += i - ptr;
          continue;
        }
      }
      if (count <= c.get(si) / 2) {
        ans += i - ptr;
        ptr += 1;
        fstr.add(si);
      } else {
        lstr.add(si);
      }
    }
    Collections.reverse(lstr);
    n /= 2;
    int[] perm = new int[n];
    Map<Character, List<Integer>> fdc = new HashMap<>();
    Map<Character, Integer> ldc = new HashMap<>();
    int lcnt = 0;
    for (int i = 0; i < n; i++) {
      char fi = fstr.get(i);
      if (!fdc.containsKey(fi)) {
        fdc.put(fi, new ArrayList<>());
      }
      fdc.get(fi).add(i+1);
    }
    for (int i = 0; i < n; i++) {
      char li = lstr.get(i);
      perm[i] = fdc.get(li).get(ldc.get(li));
      ldc.put(li, ldc.get(li) + 1);
    }
    Bit sol = new Bit(n+2);
    for (int i = 0; i < n; i++) {
      int p = perm[i];
      ans += sol.sum(n+1) - sol.sum(p);
      sol.add(p, 1);
    }
    System.out.println(ans);
  }
}
```

This Java code does the same thing as your Python code. It uses the `Bit` class to implement a binary indexed tree, and uses `HashMap` and `ArrayList` instead of `Counter` and `defaultdict` from the `collections` module in Python. It also uses `System.exit(0)` to exit the program when an error is detected.
<|EOT|>
