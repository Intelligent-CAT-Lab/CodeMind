import java.util.Scanner;
public class Main{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int a=s.nextInt();
System.out.println("[INST]5;a;s.nextInt();"+a);
         int b=s.nextInt();
System.out.println("[INST]6;b;s.nextInt();"+b);
         int x=s.nextInt();
System.out.println("[INST]7;x;s.nextInt();"+x);
         if(a+b>=x&&a<=x){
             System.out.println("YES");
         }
        
         else
         System.out.println("NO");
        
     }
}