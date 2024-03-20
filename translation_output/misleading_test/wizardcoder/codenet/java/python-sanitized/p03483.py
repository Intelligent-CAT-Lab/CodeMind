import java.util.Arrays;

public class p03483 {
  private static void solve() {
    char[] s = ns();
    int n = s.length;
    int[] idx = new int[26];
    
    for (int i = 0; i < n; i ++) {
      int c = s[i] - 'a';
      idx[c] ++;
    }
    int[][] a = new int[26][];
    for (int i = 0; i < 26; i ++) {
      a[i] = new int[idx[i]];
    }

    int[] map = new int[n];
    Arrays.fill(map, -1);

    int[] ptr = new int[26];
    int now = 0;
    int oddUsed = -1;
    for (int i = 0; i < n; i ++) {
      int c = s[i] - 'a';
      
      boolean odd = idx[c] % 2 == 1;
      if (odd && oddUsed >= 0 && oddUsed!= c) {
        System.out.println(-1);
        return;
      }

      int p = ptr[c];
      if (p < idx[c] / 2) {
        map[i] = now ++;
      } else if (odd && p == idx[c] / 2) {
        map[i] = n / 2;
        oddUsed = c;
      } else {
        int inv = idx[c] - p - 1;
        map[i] = n - a[c][inv] - 1;
      }
      a[c][p] = map[i];
      ptr[c] ++;
    }
    int[] array = new int[n];
    for (int i = 0; i < n; i ++) {
      array[map[i]] = i;
    }
    long x = bubbleCount(array, 0, n);
    System.out.println(x);
  }

  public static long bubbleCount(int[] a, int l, int r)
  {
      if(r - l <= 1)return 0;
      int m = (l+r)/2;
      long ret = bubbleCount(a, l, m) + bubbleCount(a, m, r);
      int[] temp = Arrays.copyOfRange(a, l, r);
      for(int p0 = 0, p1 = m-l, p = l;p < r;){
          if(p0 == m-l){
              a[p++] = temp[p1++];
          }else if(p1 == r-l){
              a[p++] = temp[p0++];
          }else if(temp[p0] <= temp[p1]){
              a[p++] = temp[p0++];
          }else{
              a[p++] = temp[p1++];
              ret += m