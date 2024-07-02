import java.util.Scanner;

public class Main{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x = sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
    if(x>=30){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
