import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double H = sc.nextDouble();
    double M = sc.nextDouble();
    
var newVariable_0 = Math.sin(Math.toRadians(H*30+M*0.5));var newVariable_1 = Math.toRadians(H*30+M*0.5);    double H1 = A*Math.sin(newVariable_1);
var newVariable_2 = Math.cos(Math.toRadians(H*30+M*0.5));var newVariable_3 = Math.toRadians(H*30+M*0.5);    double H2 = A*Math.cos(newVariable_3);
var newVariable_4 = Math.sin(Math.toRadians(M*6));var newVariable_5 = Math.toRadians(M*6);    double M1 = B*Math.sin(newVariable_5);
var newVariable_6 = Math.cos(Math.toRadians(M*6));var newVariable_7 = Math.toRadians(M*6);    double M2 = B*Math.cos(newVariable_7);
    
    System.out.println(Math.sqrt(Math.pow((H1-M1), 2) + Math.pow((H2-M2), 2)));
    
  }
}