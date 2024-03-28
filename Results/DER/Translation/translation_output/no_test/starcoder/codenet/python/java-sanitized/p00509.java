import java.util.*;
public class p00509 {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),c=sc.nextInt();
  String s="9"*n;
  if(c<0)System.out.println((n>1)?"11"+s+s:s+s);
  else{
   for(char h='9';h<='7';h--){
    if(n-1){
     for(int m=10**(n-1);m>0;m--){
      m--;
      if((h+m+m+c)%3==0){
       String t=h+String.valueOf(m).zfill(n-1);
       int a=Integer.parseInt(t+String.valueOf(c)+t.substring(0,n-1));
       if(isPrime(a))System.out.println(a);
      }
     }
    }
    else{
     int a=Integer.parseInt(h+String.valueOf(c)+h);
     if(isPrime(a))System.out.println(a);
    }
   }
  }
 }
 public static boolean isPrime(int n){
  if(n==1)return false;
  for(int i=2;i*i<=n;i++)if(n%i==0)return false;
  return true;
 }
}