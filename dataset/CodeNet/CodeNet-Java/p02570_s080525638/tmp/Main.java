import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
System.out.println("[INST]6;d;sc.nextInt();"+d);
    int t = sc.nextInt();
System.out.println("[INST]7;t;sc.nextInt();"+t);
    int s = sc.nextInt();
System.out.println("[INST]8;s;sc.nextInt();"+s);
    sc.close();
    if( (s * t) < d){
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
