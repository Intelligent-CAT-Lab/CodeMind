import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
System.out.println("[INST]5;N;sc.nextInt();"+N);
    int K = sc.nextInt();
System.out.println("[INST]6;K;sc.nextInt();"+K);
    int ans;

    if(N % K == 0){
      ans = 0;
    }else{
      ans = 1;
    }

    System.out.println(ans);
  }
}
