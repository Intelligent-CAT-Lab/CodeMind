import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double pi = Math.PI;
    double r = scanner.nextDouble();
System.out.println("[INST]7;r;scanner.nextDouble();"+r);
    double area = area(r);
    double length = length(r);
    System.out.printf("%f %f", area, length);
System.out.println("[INST]10;None;System.out.printf('%f %f', area, length);"+System.out.printf("%f %f", area, length));
  }

  public static double area(double r){
    double pi = Math.PI;
    return r * r * pi;
  }

  public static double length(double r){
    double pi = Math.PI;
    return 2 * pi * r;
  }
}