import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
 
    int c = a % 3;
    int d = b % 3;
    int e = ( a + b ) % 3;
 
    if ((c==0) || (d==0) || (e==0) ){
      System.out.println("Possible");
    }
    else {
      System.out.println("Impossible");
    }
  }
}