<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        List<List<String>> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(".");
            }
            a.add(temp);
        }
        if (n % 2 == 1) {
            a.get(n - 2).set(n - 3, "a");
            a.get(n - 2).set(n - 4, "a");
            a.get(n - 2).set(n - 5, "a");
            a.get(n - 1).set(n - 2, "b");
            a.get(n - 1).set(n - 3, "b");
            a.get(n - 1).set(n - 4, "b");
            a.get(n - 1).set(n - 5, "b");
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n / 2; i++) {
                a.get(n - i - 2).set(i, "c");
                a.get(n - i - 2).set(i + 1, "d");
                a.get(n - i - 1).set(i, "c");
                a.get(n - i - 1).set(i + 1, "d");
            }
        } else {
            for (int i = 0; i < n / 2 - 1; i++) {
                a.get(i).set(i + 2, "c");
                a.get(i).set(i + 3, "d");
                a.get(i + 1).set(i + 2, "c");
                a.get(i + 1).set(i + 3, "d");
            }
            a.get(n - 2).set(0, "c");
            a.get(n - 2).set(1, "d");
            a.get(n - 1).set(0, "c");
            a.get(n - 1).set(1, "d");
        }
        for (List<String> temp : a) {
            for (String s : temp) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
```</s>
