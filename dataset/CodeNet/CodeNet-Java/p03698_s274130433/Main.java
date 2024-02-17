import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
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