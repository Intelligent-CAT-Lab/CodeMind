import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class p03483 {
  private int size;
  private int[] tree;

  public Bit(int n) {
    this.size = n;
    this.tree = new int[n + 1];
  }

  public int sum(int i) {
    int s = 0;
    while (i > 0) {
      s += this.tree[i];
      i -= i & -i;
    }
    return s;
  }

  public void add(int i, int x) {
    while (i <= this.size) {
      this.tree[i] += x;
      i += i & -i;
    }
  }
}

public class p03483 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int n = s.length();
    Map<Character, Integer> c = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char si = s.charAt(i);
      c.put(si, c.getOrDefault(si, 0) + 1);
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
      for (char st : c.keySet()) {
        int i = c.get(st);
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
        ptr++;
        fstr.add(si);
      } else {
        lstr.add(si);
      }
    }
    lstr = lstr.subList(lstr.size() - n / 2, lstr.size());
    int[] perm = new int[n / 2];
    Map<Character, List<Integer>> fdc = new HashMap<>();
    Map<Character, Integer> ldc = new HashMap<>();
    int lcnt = 0;
    for (int i = 0; i < n / 2; i++) {
      char fi = fstr.get(i);
      fdc.put(fi, new ArrayList<>());
      fdc.get(fi).add(i + 1);
    }
    for (int i = 0; i < n / 2; i++) {
      char li = lstr.get(i);
      perm[i] = fdc.get(li).get(ldc.getOrDefault(li, 0));
      ldc.put(li, ldc.getOrDefault(li, 0) + 1);
    }
    Bit sol = new Bit(n + 2);
    for (int i = 0; i < n / 2; i++) {
      int p = perm[i];
      ans += sol.sum(n + 1) - sol.sum(p);
      sol.add(p, 1);
    }
    System.out.println(ans);
  }
}