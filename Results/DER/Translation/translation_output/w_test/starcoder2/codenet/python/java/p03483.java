
```java
import java.util.*;

class Bit {
  int size;
  int[] tree;

  Bit(int n) {
    size = n;
    tree = new int[n + 1];
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
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    Map<Character, Integer> c = new HashMap<>();
    for (char ch : s.toCharArray()) {
      c.put(ch, c.getOrDefault(ch, 0) + 1);
    }
    int flg = 0;
    if (n % 2 == 0) {
      for (int i : c.values()) {
        if (i % 2 != 0) {
          System.out.println(-1);
          return;
        }
      }
    } else {
      for (Map.Entry<Character, Integer> entry : c.entrySet()) {
        char st = entry.getKey();
        int i = entry.getValue();
        if (i % 2 != 0 && flg != 0) {
          System.out.println(-1);
          return;
        } else if (i % 2 != 0) {
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
      fdc.get(fi).add(i + 1);
    }
    for (int i = 0; i < n; i++) {
      char li = lstr.get(i);
      perm[i] = fdc.get(li).get(ldc.get(li));
      ldc.put(li, ldc.get(li) + 1);
    }
    Bit sol = new Bit(n + 2);
    for (int i = 0; i < n; i++) {
      int p = perm[i];
      ans += sol.sum(n + 1) - sol.sum(p);
      sol.add(p, 1);
    }
    System.out.println(ans);
  }
}
```

## 2. 10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
