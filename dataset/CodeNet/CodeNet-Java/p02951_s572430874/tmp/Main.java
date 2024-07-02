import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
        int c =sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
        //System.out.println(max);
        if(c-(a-b)<0){
            System.out.println("0");
        }else{
        System.out.println(c-(a-b));
        }

    }
}