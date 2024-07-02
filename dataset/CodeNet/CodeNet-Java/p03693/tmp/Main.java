import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
System.out.println("[INST]5;None;scan.nextInt();"+scan.nextInt());
        int g=scan.nextInt()*10;
System.out.println("[INST]6;None;scan.nextInt();"+scan.nextInt());
        int b=scan.nextInt();
System.out.println("[INST]7;b;scan.nextInt();"+b);
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}