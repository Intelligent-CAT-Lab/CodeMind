

```

x, y = map(int, input().split())
p = 0
a = x
b = y
while x % y != 0:
    z = x
    x = y
    y = z % y
m = a + b - y

if a % 2 == 0 or b % 2 == 0 or a == b or a % 2 > 0 and b % 2 > 0:
    print(m + 1)
else:
    print(m)

```

## 00357

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

class p00357 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int dd = 0;
        int ee = 0;
        int ff = 0;
        int gg = 0;
        int hh = 0;
        int ii = 0;
        int jj = 0;
        int kk = 0;
        int ll = 0;
        int mm = 0;
        int nn = 0;
        int oo = 0;
        int pp = 0;
        int qq = 0;
        int rr = 0;
        int ss = 0;
        int tt = 0;
        int uu = 0;
        int vv = 0;
        int ww = 0;
        int xx = 0;
        int yy = 0;
        int zz = 0;
        int aaa = 0;
        int bbb = 0;
        int ccc = 0;
        int ddd = 0;
        int eee = 0;
        int fff = 0;
        int ggg = 0;
        int hhh = 0;
        int iii = 0;
        int jjj = 0;
        int kkk = 0;
        int lll = 0;
        int mmm = 0;
        int nnn = 0;
        int ooo = 0;
        int ppp = 0;
        int qqq = 0;
        int rrr = 0;
        int sss = 0;
        int ttt = 0;
        int uuu = 0;
        int vvv = 0;
        int www = 0;
        int xxx = 0;
        int yyy = 0;
        int zzz = 0;
        int aaaa = 0;
        int bbbb = 0;
        int cccc = 0;
        int dddd = 0;
        int eeee = 0;
        int ffff = 0;
        int gggg = 0;
        int hhhh = 0;
        int iiii = 0;
        int jjjj = 0;
        int kkkk = 0;
        int llll = 0;
        int mmmm = 0;
        int nnnn = 0;
        int oooo = 0;
        int pppp = 0;
        int qqqq = 0;
        int rrrr = 0;
        int ssss = 0;
        int tttt = 0;
        int uuuu = 0;
        int vvvv = 0;
        int wwww = 0;
        int xxxx = 0;
        int yyyy = 0;
        int zzzz = 0;
        int aaaaa = 0;
        int bbbbb = 0;
        int ccccc = 0;
        int ddddd = 0;
        int eeeee = 0;
        int fffff = 0;
        int ggggg = 0;
        int hhhhh = 0;
        int iiiii = 0;
        int jjjjj = 0;
        int kkkkk = 0;
        int lllll = 0;
        int mmmmm = 0;
        int nnnnn = 0;
        int ooooo = 0;
        int ppppp = 0;
        int qqqqq = 0;
        int rrrrr = 0;
        int sssss = 0;
        int ttttt = 0;
        int uuuuu = 0;
        int vvvvv = 0;
        int wwwww = 0;
        int xxxxx = 0;
        int yyyyy = 0;
        int zzzzz = 0;
        int aaaaaa = 0;
        int bbbbbb = 0;
        int cccccc = 0;
        int dddddd = 0;
        int eeeeee = 0;
        int ffffff = 0;
        int gggggg = 0;
        int hhhhhh = 0;
        int iiiiii = 0;
        int jjjjjj = 0;
        int kkkkkk = 0;
        int llllll = 0;
        int mmmmmm = 0;
        int nnnnnn = 0;
        int oooooo = 0;
        int pppppp = 0;
        int qqqqqq = 0;
        int rrrrrr = 0;
        int ssssss = 0;
        int tttttt = 0;
        int uuuuuu = 0;
        int vvvvvv = 0;
        int wwwwww = 0;
        int xxxxxx = 0;
        int yyyyyy = 0;
        int zzzzzz = 0;
        int aaaaaaa = 0;
        int bbbbbbb = 0;
        int ccccccc = 0;
        int ddddddd = 0;
        int eeeeeee = 0;
        int fffffff = 0;
        int ggggggg = 0;
        int hhhhhhh = 0;
        int iiiiiii = 0;
        int jjjjjjj = 0;
        int kkkkkkk = 0;
        int lllllll = 0;
        int mmmmmmm = 0;
        int nnnnnnn = 0;
        int ooooooo = 0;
        int ppppppp = 0;
        int qqqqqqq = 0;
        int rrrrrrr = 0;
        int sssssss = 0;
        int ttttttt = 0;
        int uuuuuuu = 0;
        int vvvvvvv = 0;
        int wwwwwww = 0;
        int xxxxxxx = 0;
        int yyyyyyy = 0;
        int zzzzzzz = 0;
        int aaaaaaaa = 0;
        int bbbbbbbb = 0;
        int cccccccc = 0;
        int dddddddd = 0;
        int eeeeeeee = 0;
        int ffffffff = 0;
        int gggggggg = 0;
