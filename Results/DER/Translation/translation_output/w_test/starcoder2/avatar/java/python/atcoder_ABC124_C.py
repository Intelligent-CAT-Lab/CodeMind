

```python
s = input()
ans1 = 0
ans2 = 0

for i in range(len(s)):
    if i % 2 == 0:
        if s[i] == '0':
            ans1 += 1
        else:
            ans2 += 1
    else:
        if s[i] == '1':
            ans1 += 1
        else:
            ans2 += 1

print(min(ans1, ans2))
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

class atcoder_ABC124_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        int[] e = new int[n];
        int[] f = new int[n];
        int[] g = new int[n];
        int[] h = new int[n];
        int[] i = new int[n];
        int[] j = new int[n];
        int[] l = new int[n];
        int[] m = new int[n];
        int[] o = new int[n];
        int[] p = new int[n];
        int[] q = new int[n];
        int[] r = new int[n];
        int[] t = new int[n];
        int[] u = new int[n];
        int[] v = new int[n];
        int[] w = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        int[] aa = new int[n];
        int[] bb = new int[n];
        int[] cc = new int[n];
        int[] dd = new int[n];
        int[] ee = new int[n];
        int[] ff = new int[n];
        int[] gg = new int[n];
        int[] hh = new int[n];
        int[] ii = new int[n];
        int[] jj = new int[n];
        int[] kk = new int[n];
        int[] ll = new int[n];
        int[] mm = new int[n];
        int[] nn = new int[n];
        int[] oo = new int[n];
        int[] pp = new int[n];
        int[] qq = new int[n];
        int[] rr = new int[n];
        int[] ss = new int[n];
        int[] tt = new int[n];
        int[] uu = new int[n];
        int[] vv = new int[n];
        int[] ww = new int[n];
        int[] xx = new int[n];
        int[] yy = new int[n];
        int[] zz = new int[n];
        int[] aaa = new int[n];
        int[] bbb = new int[n];
        int[] ccc = new int[n];
        int[] ddd = new int[n];
        int[] eee = new int[n];
        int[] fff = new int[n];
        int[] ggg = new int[n];
        int[] hhh = new int[n];
        int[] iii = new int[n];
        int[] jjj = new int[n];
        int[] kkk = new int[n];
        int[] lll = new int[n];
        int[] mmm = new int[n];
        int[] nnn = new int[n];
        int[] ooo = new int[n];
        int[] ppp = new int[n];
        int[] qqq = new int[n];
        int[] rrr = new int[n];
        int[] sss = new int[n];
        int[] ttt = new int[n];
        int[] uuu = new int[n];
        int[] vvv = new int[n];
        int[] www = new int[n];
        int[] xxx = new int[n];
        int[] yyy = new int[n];
        int[] zzz = new int[n];
        int[] aaaa = new int[n];
        int[] bbbb = new int[n];
        int[] cccc = new int[n];
        int[] dddd = new int[n];
        int[] eeee = new int[n];
        int[] ffff = new int[n];
        int[] gggg = new int[n];
        int[] hhhh = new int[n];
        int[] iiii = new int[n];
        int[] jjjj = new int[n];
        int[] kkkk = new int[n];
        int[] llll = new int[n];
        int[] mmmm = new int[n];
        int[] nnnn = new int[n];
        int[] oooo = new int[n];
        int[] pppp = new int[n];
        int[] qqqq = new int[n];
        int[] rrrr = new int[n];
        int[] ssss = new int[n];
        int[] tttt = new int[n];
        int[] uuuu = new int[n];
        int[] vvvv = new int[n];
        int[] wwww = new int[n];
        int[] xxxx = new int[n];
        int[] yyyy = new int[n];
        int[] zzzz = new int[n];
        int[] aaaaa = new int[n];
        int[] bbbbb = new int[n];
        int[] ccccc = new int[n];
        int[] ddddd = new int[n];
        int[] eeeee = new int[n];
        int[] fffff = new int[n];
        int[] ggggg = new int[n];
        int[] hhhhh = new int[n];
        int[] iiiii = new int[n];
        int[] jjjjj = new int[n];
        int[] kkkkk = new int[n];
        int[] lllll = new int[n];
        int[] mmmmm = new int[n];
        int[] nnnnn = new int[n];
        int[] ooooo = new int[n];
        int[] ppppp = new int[n];
        int[] qqqqq = new int[n];
        int[] rrrrr = new int[n];
        int[] sssss = new int[n];
        int[] ttttt = new int[n];
        int[] uuuuu = new int[n];
        int[] vvvvv = new int[n];
        int[] wwwww = new int[n];
        int[] xxxxx = new int[n];
        int[] yyyyy = new int[n];
        int[] zzzzz = new int[n];
        int[] aaaaaa = new int[n];
        int[] bbbbbb = new int[n];
        int[] cccccc = new int[n];
        int[] dddddd = new int[n];
        int[] eeeeee = new int[n];
        int[] ffffff = new int[n];
        int[] gggggg = new int[n];
        int[] hhhhhh = new int[n];
        int[] iiiiii = new int[n];
        int[] jjjjjj = new int[n];
        int[] kkkkkk = new int[n];
        int[] llllll = new int[n];
        int[] mmmmmm = new int[n];
        int[] nnnnnn = new int[n];
        int
