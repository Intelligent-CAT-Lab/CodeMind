import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
var newVariable_0 = s.matches(pat);        if(newVariable_0) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}
