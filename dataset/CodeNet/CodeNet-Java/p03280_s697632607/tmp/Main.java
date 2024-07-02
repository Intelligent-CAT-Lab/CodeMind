import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
System.out.println("[INST]5;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]5;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]6;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]6;None;sc.next();"+sc.next());
        System.out.println(a*b - b - a + 1);
    }  
}