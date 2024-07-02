import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
System.out.println("[INST]4;n;sc.nextInt();"+n);

    if(1<=n && n<=9){
      int i = n*n*n;
      System.out.println(i);
    }

  }
}
