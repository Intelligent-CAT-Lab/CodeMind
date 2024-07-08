import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println(fun(s));
  }
  public static int fun(String s){
    int len=s.length(),res=0;
    for(int i=0;i<len/2;i++){
var newVariable_0 = s.charAt(i);var newVariable_1 = s.charAt(len-1-i);      if(s.charAt(i)!=newVariable_1) res++;
    }
    return res;
  }
}
