import java.util.*;
public class Main{
   public static void main(String[]args){

      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
      int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);

      System.out.println(a*b+" "+2*(a+b));

   }
}