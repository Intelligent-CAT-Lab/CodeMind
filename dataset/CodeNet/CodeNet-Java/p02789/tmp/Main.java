import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
System.out.println("[INST]4;n;sc.nextInt();"+n);
    int m=sc.nextInt();
System.out.println("[INST]5;m;sc.nextInt();"+m);
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}