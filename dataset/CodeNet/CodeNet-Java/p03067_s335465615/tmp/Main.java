import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
        boolean ans = false;
        if(a <= b) {
            if(a <= c && c <= b) ans = true;
        } else {
            if(a >= c && c >= b) ans = true;
        }
        System.out.println((ans?"Yes":"No"));
        
    } 
}