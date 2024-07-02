import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b=sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        if(a<b) System.out.println("a < b");
        else if(a>b) System.out.println("a > b");
        else System.out.println("a == b");
        sc.close();
    }
}
