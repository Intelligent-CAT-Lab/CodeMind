import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
System.out.println("[INST]5;n;sc.next();"+n);
        int a = Integer.parseInt(n.substring(0,1));
System.out.println("[INST]6;a;Integer.parseInt(n.substring(0,1));"+a);
System.out.println("[INST]6;None;n.substring(0,1);"+n.substring(0,1));
        int b = Integer.parseInt(n.substring(1,2));
System.out.println("[INST]7;b;Integer.parseInt(n.substring(1,2));"+b);
System.out.println("[INST]7;None;n.substring(1,2);"+n.substring(1,2));
        int c = Integer.parseInt(n.substring(2,3));
System.out.println("[INST]8;c;Integer.parseInt(n.substring(2,3));"+c);
System.out.println("[INST]8;None;n.substring(2,3);"+n.substring(2,3));
        int d = Integer.parseInt(n.substring(3,4));
System.out.println("[INST]9;d;Integer.parseInt(n.substring(3,4));"+d);
System.out.println("[INST]9;None;n.substring(3,4);"+n.substring(3,4));
        if(a+b+c+d==7) {
            System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
            return;
        }
        if(a+b+c-d==7) {
            System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
            return;
        }
        if(a+b-c+d==7) {
            System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
            return;
        }
        if(a-b+c+d==7) {
            System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
            return;
        }
        if(a+b-c-d==7) {
            System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
            return;
        }
        if(a-b+c-d==7) {
            System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
            return;
        }
        if(a-b-c+d==7) {
            System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
            return;
        }
        if(a-b-c-d==7) {
            System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");
            return;
        }
        
    }
}
