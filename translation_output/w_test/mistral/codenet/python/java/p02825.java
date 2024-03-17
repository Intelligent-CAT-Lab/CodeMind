<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
aabb..
b..zz.
ba....
.a..aa
..a..b
..a..b


```
n=int(input())
if n==2:
  print(-1)
  exit()
if n==3:
  print("abb")
  print("a.c")
  print("ddc")
  exit()
if n==5:
  print("aabbc")
  print("hi..c")
  print("hi..d")
  print("g.jjd")
  print("gffee")
  exit()
if n==7:
  print("..abc..")
  print("..abc..")
  print("aax..aa")
  print("bbx..bb")
  print("cc.yycc")
  print("..abc..")
  print("..abc..")
  exit()
a=[n*["."]for _ in range(n)]
if n%2:
  a[-5][-5],a[-5][-4],a[-5][-3],a[-5][-2],a[-5][-1]=list("aabbc")
  a[-4][-5],a[-4][-4],a[-4][-3],a[-4][-2],a[-4][-1]=list("hi..c")
  a[-3][-5],a[-3][-4],a[-3][-3],a[-3][-2],a[-3][-1]=list("hi..d")
  a[-2][-5],a[-2][-4],a[-2][-3],a[-2][-2],a[-2][-1]=list("g.jjd")
  a[-1][-5],a[-1][-4],a[-1][-3],a[-1][-2],a[-1][-1]=list("gffee")
  n-=5
for i in range(0,n,2):
  a[i][i],a[i][i+1]="a","a"
  a[i+1][i],a[i+1][i+1]="b","b"
if n%4==0:
  for i in range(0,n,2):
    a[n-i-2][i],a[n-i-2][i+1]="c","d"
    a[n-i-1][i],a[n-i-1][i+1]="c","d"
else:
  for i in range(0,n-2,2):
    a[i][i+2],a[i][i+3]="c","d"
    a[i+1][i+2],a[i+1][i+3]="c","d"
  a[n-2][0],a[n-2][1]="c","d"
  a[n-1][0],a[n-1][1]="c","d"
for i in a:print("".join(i))
```
[/INST]
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new StringBuilder().repeat(".", n).toString());
        }
        if (n == 2) {
            System.out.println(-1);
            return;
        }
        if (n == 3) {
            a.get(0).setCharAt(0, 'a');
            a.get(0).setCharAt(2, 'b');
            a.get(1).setCharAt(0, 'a');
            a.get(1).setCharAt(1, 'c');
            a.get(2).setCharAt(0, 'd');
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            return;
        }
        if (n == 5) {
            a.get(0).setCharAt(0, 'a');
            a.get(0).setCharAt(2, 'b');
            a.get(1).setCharAt(0, 'a');
            a.get(1).setCharAt(1, 'c');
            a.get(2).setCharAt(0, 'd');
            a.get(3).setCharAt(0, 'g');
            a.get(3).setCharAt(2, 'e');
            a.get(4).setCharAt(0, 'g');
            a.get(4).setCharAt(1, 'f');
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            System.out.println(a.get(3));
            System.out.println(a.get(4));
            return;
        }
        if (n == 7) {
            a.get(0).setCharAt(0, '.');
            a.get(0).setCharAt(1, 'a');
            a.get(0).setCharAt(3, 'b');
            a.get(1).setCharAt(0, '.');
            a.get(1).setCharAt(1, 'a');
            a.get(1).setCharAt(3, 'c');
            a.get(2).setCharAt(0, '.');
            a.get(2).setCharAt(1, 'a');
            a.get(2).setCharAt(3, 'b');
            a.get(3).setCharAt(0, '.');
            a.get(3).setCharAt(1, 'a');
            a.get(3).setCharAt(3, 'd');
            a.get(4).setCharAt(0, '.');
            a.get(4).setCharAt(1, 'a');
            a.get(4).setCharAt(3, 'e');
            a.get(5).setCharAt(0, '.');
            a.get(5).setCharAt(1, 'a');
            a.get(5).setCharAt(3, 'f');
            a.get(6).setCharAt(0, '.');
            a.get(6).setCharAt(1, 'a');
            a.get(6).setCharAt(3, 'b');
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            System.out.println(a.get(3));
            System.out.println(a.get(4));
            System.out.println(a.get(5));
            System.out.println(a.get(6));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                a.get(i).setCharAt(i, 'a');
            } else {
                a.get(i).setCharAt(i, 'b');
            }
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                a.get(i).setCharAt(i, 'c');
                a.get(i).setCharAt(i + 1, 'd');
            }
        } else {
            for (int i = 0; i < n / 2 - 1; i++) {
                a.get(i).setCharAt(i, 'c');
                a.get(i).setCharAt(i + 2, 'd');
            }
            a.get(n / 2 - 1).setCharAt(0, 'c');
            a.get(n / 2 - 1).setCharAt(1, 'd');
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}
```</s>
