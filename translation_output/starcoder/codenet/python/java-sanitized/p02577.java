import java.util.*;
public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n.charAt(i) + "")) % 9;
        }
        System.out.println(tmp == 0? "Yes" : "No");
    }
}