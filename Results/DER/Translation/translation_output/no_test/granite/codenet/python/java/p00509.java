System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
def p(x):
 for i in range(7,int(x**.5+1),2):
  if x%i==0:return 0
 return 1
def f():
 n,c=map(int,input().split());s='9'*n
 if c<0:return(11,s+s)[n>1]
 for h in'9731':
  if n-1:
   for m in range(int(10**~-n),0,-1):
    m=str(m-1)
    if(sum(int(k)for k in h+m)*2+c)%3:
     t=h+m.zfill(n-1);a=int(t+str(c)+t[::-1])
     if p(a):return a
  else:
   a=int(h+str(c)+h)
   if p(a):return a
print(f())

```


Answer:
```java
import java.util.*;
public class Main {
 static boolean isPrime(int n) {
  if (n <= 1) return false;
  if (n <= 3) return true;
  if (n % 2 == 0 || n % 3 == 0) return false;
  for (int i = 5; i * i <= n; i = i + 6)
   if (n % i == 0 || n % (i + 2) == 0)
    return false;
  return true;
 }
 static int f() {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(), c = sc.nextInt();
  String s = "9";
  if (c < 0) return 11;
  for (char h : "9731".toCharArray()) {
   if (n > 1) {
    for (int m = (int) Math.pow(10, n - 2); m > 0; m--) {
     String m_str = String.valueOf(m - 1);
     if (((h - '0') + (m_str.charAt(m_str.length() - 1) - '0') * 2 + c) % 3!= 0) {
      String t = String.valueOf(h) + m_str.substring(0, n - 2);
      int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
      if (isPrime(a)) return a;
     }
    }
   } else {
    int a = Integer.parseInt(String.valueOf(h) + c + h);
    if (isPrime(a)) return a;
   }
  }
  return 0;
 }
 public static void main(String[] args) {
  System.out.println(f());
 }
}
```<|endoftext|>
