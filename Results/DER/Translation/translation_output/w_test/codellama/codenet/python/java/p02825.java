<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

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
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = '.';
            }
        }
        if (n % 2 == 1) {
            a[n - 5][n - 5] = 'a';
            a[n - 5][n - 4] = 'a';
            a[n - 5][n - 3] = 'b';
            a[n - 5][n - 2] = 'b';
            a[n - 5][n - 1] = 'c';
            a[n - 4][n - 5] = 'h';
            a[n - 4][n - 4] = 'i';
            a[n - 4][n - 3] = '.';
            a[n - 4][n - 2] = '.';
            a[n - 4][n - 1] = 'c';
            a[n - 3][n - 5] = 'h';
            a[n - 3][n - 4] = 'i';
            a[n - 3][n - 3] = '.';
            a[n - 3][n - 2] = '.';
            a[n - 3][n - 1] = 'd';
            a[n - 2][n - 5] = 'g';
            a[n - 2][n - 4] = '.';
            a[n - 2][n - 3] = 'j';
            a[n - 2][n - 2] = 'j';
            a[n - 2][n - 1] = 'd';
            a[n - 1][n - 5] = 'g';
            a[n - 1][n - 4] = 'f';
            a[n - 1][n - 3] = 'f';
            a[n - 1][n - 2] = 'e';
            a[n - 1][n - 1] = 'e';
            n -= 5;
        }
        for (int i = 0; i < n; i += 2) {
            a[i][i] = 'a';
            a[i][i + 1] = 'a';
            a[i + 1][i] = 'b';
            a[i + 1][i + 1] = 'b';
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2][i] = 'c';
                a[n - i - 2][i + 1] = 'd';
                a[n - i - 1][i] = 'c';
                a[n - i - 1][i + 1] = 'd';
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i][i + 2] = 'c';
                a[i][i + 3] = 'd';
                a[i + 1][i + 2] = 'c';
                a[i + 1][i + 3] = 'd';
            }
            a[n - 2][0] = 'c';
            a[n - 2][1] = 'd';
            a[n - 1][0] = 'c';
            a[n - 1][1] = 'd';
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
```
This code
