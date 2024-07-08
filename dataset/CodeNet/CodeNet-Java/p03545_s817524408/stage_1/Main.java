import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
var newVariable_0 = n.substring(0,1);        int a = Integer.parseInt(newVariable_0);
var newVariable_1 = n.substring(1,2);        int b = Integer.parseInt(newVariable_1);
var newVariable_2 = n.substring(2,3);        int c = Integer.parseInt(newVariable_2);
var newVariable_3 = n.substring(3,4);        int d = Integer.parseInt(newVariable_3);
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
