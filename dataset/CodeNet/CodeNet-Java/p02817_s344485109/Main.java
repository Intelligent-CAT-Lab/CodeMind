import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final String S = sc.next();
    final String T = sc.next();
    sc.close();
    System.out.println(T+S);
  }
}