import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
var newVariable_0 = scan.nextInt();        int r=newVariable_0*100;
var newVariable_1 = scan.nextInt();        int g=newVariable_1*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}