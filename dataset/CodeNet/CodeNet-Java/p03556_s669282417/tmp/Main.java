import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
System.out.println("[INST]5;n;Integer.parseInt(sc.next());"+n);
System.out.println("[INST]5;None;sc.next();"+sc.next());
        
        while (true) {
            if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) {
System.out.println("[INST]8;None;Math.sqrt(n);"+Math.sqrt(n));
System.out.println("[INST]8;None;Math.sqrt(n);"+Math.sqrt(n));
                System.out.println(n);
                return;
            }
            n--;
        }
    }
}
