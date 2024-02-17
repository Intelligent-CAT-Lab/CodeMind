import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int ans;

    if(N % K == 0){
      ans = 0;
    }else{
      ans = 1;
    }

    System.out.println(ans);
  }
}
