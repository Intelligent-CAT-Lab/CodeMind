import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
System.out.println("[INST]4;n;sc.nextInt();"+n);
    int x = sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
    int t = sc.nextInt();
System.out.println("[INST]6;t;sc.nextInt();"+t);
    int ans;
    if (n%x == 0){
      ans = (n/x) * t;
    }else{
      int m =  n / x;
      ans = (m+1) *t;
    }
    System.out.println(ans);
  }
}