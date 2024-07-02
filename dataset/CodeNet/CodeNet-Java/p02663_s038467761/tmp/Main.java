import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H1 = sc.nextInt();
System.out.println("[INST]5;H1;sc.nextInt();"+H1);
    int M1 = sc.nextInt();
System.out.println("[INST]6;M1;sc.nextInt();"+M1);
    int H2 = sc.nextInt();
System.out.println("[INST]7;H2;sc.nextInt();"+H2);
    int M2 = sc.nextInt();
System.out.println("[INST]8;M2;sc.nextInt();"+M2);
    int K = sc.nextInt();
System.out.println("[INST]9;K;sc.nextInt();"+K);
    
    int ans = (H2-H1)*60+(M2-M1)-K;
    System.out.println(ans);
  }
}
