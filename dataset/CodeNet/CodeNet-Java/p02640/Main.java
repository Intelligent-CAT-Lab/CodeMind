import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(); // 頭数
    double y = sc.nextInt(); // 足の数
    double crane = -(y/2) + 2*x;
    double turtle = x - crane;
    if(turtle < 0 || crane < 0 || turtle % 1 != 0 || crane % 1 != 0 ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}