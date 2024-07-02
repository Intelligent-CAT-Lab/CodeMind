import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
System.out.println("[INST]5;A;sc.nextDouble();"+A);
    double B = sc.nextDouble();
System.out.println("[INST]6;B;sc.nextDouble();"+B);
    double H = sc.nextDouble();
System.out.println("[INST]7;H;sc.nextDouble();"+H);
    double M = sc.nextDouble();
System.out.println("[INST]8;M;sc.nextDouble();"+M);
    
    double H1 = A*Math.sin(Math.toRadians(H*30+M*0.5));
System.out.println("[INST]10;None;Math.sin(Math.toRadians(H*30+M*0.5));"+Math.sin(Math.toRadians(H*30+M*0.5)));
System.out.println("[INST]10;None;Math.toRadians(H*30+M*0.5);"+Math.toRadians(H*30+M*0.5));
    double H2 = A*Math.cos(Math.toRadians(H*30+M*0.5));
System.out.println("[INST]11;None;Math.cos(Math.toRadians(H*30+M*0.5));"+Math.cos(Math.toRadians(H*30+M*0.5)));
System.out.println("[INST]11;None;Math.toRadians(H*30+M*0.5);"+Math.toRadians(H*30+M*0.5));
    double M1 = B*Math.sin(Math.toRadians(M*6));
System.out.println("[INST]12;None;Math.sin(Math.toRadians(M*6));"+Math.sin(Math.toRadians(M*6)));
System.out.println("[INST]12;None;Math.toRadians(M*6);"+Math.toRadians(M*6));
    double M2 = B*Math.cos(Math.toRadians(M*6));
System.out.println("[INST]13;None;Math.cos(Math.toRadians(M*6));"+Math.cos(Math.toRadians(M*6)));
System.out.println("[INST]13;None;Math.toRadians(M*6);"+Math.toRadians(M*6));
    
    System.out.println(Math.sqrt(Math.pow((H1-M1), 2) + Math.pow((H2-M2), 2)));
    
  }
}