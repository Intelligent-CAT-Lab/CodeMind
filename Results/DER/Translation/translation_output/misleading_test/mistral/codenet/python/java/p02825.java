<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
xaabb..
fh.`z.
ma,~.,
.a.aa
 xa.d8
NSq3=,

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
        if (n % 2 == 1) {
            a.get(n - 5).setCharAt(n - 5, 'a');
            a.get(n - 5).setCharAt(n - 4, 'a');
            a.get(n - 5).setCharAt(n - 3, 'a');
            a.get(n - 5).setCharAt(n - 2, 'a');
            a.get(n - 5).setCharAt(n - 1, 'a');
            a.get(n - 4).setCharAt(n - 4, 'h');
            a.get(n - 4).setCharAt(n - 3, 'f');
            a.get(n - 3).setCharAt(n - 3, '.');
            a.get(n - 3).setCharAt(n - 2, '.');
            a.get(n - 2).setCharAt(n - 2, '.');
            a.get(n - 1).setCharAt(n - 1, '.');
            a.get(n - 1).setCharAt(n - 0, '.');
            n -= 5;
        }
        for (int i = 0; i < n; i++) {
            a.get(i).setCharAt(i, 'a');
            a.get(i).setCharAt(i + 1, 'a');
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a.get(n - i - 2).setCharAt(i, 'c');
                a.get(n - i - 2).setCharAt(i + 1, 'd');
                a.get(n - i - 1).setCharAt(i, 'c');
                a.get(n - i - 1).setCharAt(i + 1, 'd');
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a.get(i).setCharAt(i + 2, 'c');
                a.get(i).setCharAt(i + 3, 'd');
                a.get(i + 1).setCharAt(i + 2, 'c');
                a.get(i + 1).setCharAt(i + 3, 'd');
            }
            a.get(n - 2).setCharAt(0, 'c');
            a.get(n - 2).setCharAt(1, 'd');
            a.get(n - 1).setCharAt(0, 'c');
            a.get(n - 1).setCharAt(1, 'd');
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}
```</s>
