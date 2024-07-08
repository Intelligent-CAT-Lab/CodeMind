import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        char[] c = newVariable_0.toCharArray();
        boolean bl = true;
        Arrays.sort(c);
        for (int i=1; i<c.length; i++) {
            if (c[i-1] == c[i]) {
                bl = false;
                break;
            }
        }
        System.out.println(bl?"yes":"no");
    }
}