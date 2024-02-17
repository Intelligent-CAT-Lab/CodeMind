import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = Integer.parseInt(n.substring(0,1));
        int b = Integer.parseInt(n.substring(1,2));
        int c = Integer.parseInt(n.substring(2,3));
        int d = Integer.parseInt(n.substring(3,4));
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
