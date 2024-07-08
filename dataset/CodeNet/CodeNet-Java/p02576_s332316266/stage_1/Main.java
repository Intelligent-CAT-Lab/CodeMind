import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
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