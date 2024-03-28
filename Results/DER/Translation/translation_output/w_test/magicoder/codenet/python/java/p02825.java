<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 2) {
            System.out.println(-1);
            return;
        }
        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            return;
        }
        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            return;
        }
        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            return;
        }
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = new String(new char[n]).replace("\0", ".");
        }
        if (n % 2 != 0) {
            a[n - 5] = "aabbc";
            a[n - 4] = "hi..c";
            a[n - 3] = "hi..d";
            a[n - 2] = "g.jjd";
            a[n - 1] = "gffee";
            n -= 5;
        }
        for (int i = 0; i < n; i += 2) {
            a[i] = a[i].substring(0, i) + "a" + a[i].substring(i + 1);
            a[i + 1] = a[i + 1].substring(0, i) + "b" + a[i + 1].substring(i + 1);
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2] = a[n - i - 2].substring(0, i) + "c" + a[n - i - 2].substring(i + 1);
                a[n - i - 1] = a[n - i - 1].substring(0, i) + "d" + a[n - i - 1].substring(i + 1);
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i] = a[i].substring(0, i + 2) + "c" + a[i].substring(i + 3);
                a[i + 1] = a[i + 1].substring(0, i + 2) + "d" + a[i + 1].substring(i + 3);
            }
            a[n - 2] = a[n - 2].substring(0, 0) + "c" + a[n - 2].substring(1);
            a[n - 1] = a[n - 1].substring(0, 0) + "d" + a[n - 1].substring(1);
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}
```

Please note that the Java code is not exactly the same as the Python code. The Python code uses a list comprehension to create a 2D array of strings, but Java does not support this feature. Instead, we create a 1D array of strings and then create the 2D array by copying the strings into the correct positions.<｜end▁of▁sentence｜>
