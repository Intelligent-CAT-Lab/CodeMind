import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
System.out.println("[INST]5;a;scan.nextInt();"+a);
        double t = scan.nextInt();
System.out.println("[INST]6;t;scan.nextInt();"+t);
        double r = scan.nextInt();
System.out.println("[INST]7;r;scan.nextInt();"+r);
        System.out.println(r * t / a);
        scan.close();
    }
}
