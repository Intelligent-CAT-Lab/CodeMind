import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double H = sc.nextDouble();
    double M = sc.nextDouble();
    
    double H1 = A*Math.sin(Math.toRadians(H*30+M*0.5));
    double H2 = A*Math.cos(Math.toRadians(H*30+M*0.5));
    double M1 = B*Math.sin(Math.toRadians(M*6));
    double M2 = B*Math.cos(Math.toRadians(M*6));
    
    System.out.println(Math.sqrt(Math.pow((H1-M1), 2) + Math.pow((H2-M2), 2)));
    
  }
}