import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int ans=0;

  System.out.println(lcm(360,x)/x);
}

 static int gcd(int a, int b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
      
    // method to return LCM of two numbers 
    static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
}