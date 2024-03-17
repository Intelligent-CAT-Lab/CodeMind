import java.util.*;
public class p01521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x'? 'x' : 'o');
    }
}