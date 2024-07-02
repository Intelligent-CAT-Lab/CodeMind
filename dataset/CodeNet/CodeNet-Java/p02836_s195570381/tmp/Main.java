import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
    System.out.println(fun(s));
  }
  public static int fun(String s){
    int len=s.length(),res=0;
System.out.println("[INST]9;len;s.length();"+len);
    for(int i=0;i<len/2;i++){
      if(s.charAt(i)!=s.charAt(len-1-i)) res++;
System.out.println("[INST]11;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]11;None;s.charAt(len-1-i);"+s.charAt(len-1-i));
    }
    return res;
  }
}
