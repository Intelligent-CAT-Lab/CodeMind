import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}
