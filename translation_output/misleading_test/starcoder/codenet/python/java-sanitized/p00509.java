import java.util.*;
public class p00509 {
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