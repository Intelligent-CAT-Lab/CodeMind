import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);
        if(s.matches(pat)) System.out.println("YES");
System.out.println("[INST]8;None;s.matches(pat);"+s.matches(pat));
        else System.out.println("NO");
        sc.close();
    }

}
