import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
var newVariable_0 = S.replace("eraser", "").replace("erase", "").replace("dreamer", "");var newVariable_1 = S.replace("eraser", "").replace("erase", "");var newVariable_2 = S.replace("eraser", "");        String replaced = newVariable_2.replace("erase", "").replace("dreamer", "").replace("dream", "");
var newVariable_3 = replaced.length();        if(newVariable_3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
