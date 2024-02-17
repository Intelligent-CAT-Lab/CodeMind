import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String replaced = S.replace("eraser", "").replace("erase", "").replace("dreamer", "").replace("dream", "");
        if(replaced.length() == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
