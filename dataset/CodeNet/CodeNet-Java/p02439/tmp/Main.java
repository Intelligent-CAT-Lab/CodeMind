import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
        int min = Math.min(a,b);
System.out.println("[INST]7;min;Math.min(a,b);"+min);
        int max = Math.max(a,b);
System.out.println("[INST]8;max;Math.max(a,b);"+max);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}
