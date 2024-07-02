import java.util.*;

class Main{
    void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
        int d = sc.nextInt();
System.out.println("[INST]8;d;sc.nextInt();"+d);
        if ( a == b && c == d ||
             a == c && b == d ||
             a == d && b == c ) System.out.println("yes");
        else System.out.println("no");
    }

    public static void main(String[] args){ new Main().solve(); }
}


