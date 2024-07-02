import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
System.out.println("[INST]5;p;Integer.parseInt(sc.next());"+p);
System.out.println("[INST]5;None;sc.next();"+sc.next());
        int m = Integer.parseInt(sc.next());
System.out.println("[INST]6;m;Integer.parseInt(sc.next());"+m);
System.out.println("[INST]6;None;sc.next();"+sc.next());
        int c = Integer.parseInt(sc.next());
System.out.println("[INST]7;c;Integer.parseInt(sc.next());"+c);
System.out.println("[INST]7;None;sc.next();"+sc.next());

        System.out.println(p + m + c);
    }
}

