<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 0

Expected output:
194

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),c=sc.nextInt();
  String s="9"*n;
  if(c<0)System.out.println((n>1)?11:s+s);
  else{
   for(char h='9';h>='3';h--){
    if(n-1){
     for(int m=10**(n-1);m>0;m--){
      m--;
      String m1=String.valueOf(m);
      if((h+m1+m1).chars().map(x->(x-'0')*2+c%3).sum()%3==0){
       String t=h+m1;
       int a=Integer.parseInt(t+String.valueOf(c)+new StringBuilder(t).reverse());
       if(isPrime(a))return;
      }
     }
    }else{
     int a=Integer.parseInt(h+String.valueOf(c)+h);
     if(isPrime(a))return;
    }
   }
   System.out.println(-1);
  }
 }
 public static boolean isPrime(int n){
  if(n<2)return false;
  for(int i=2;i*i<=n;i++)if(n%i==0)return false;
  return true;
 }
}
```
<|endoftext|>
