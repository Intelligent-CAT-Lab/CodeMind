import java.util.*;
public class p00006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(s.length()-1,0)+"admin"+s.substring(1,s.length()-1));
    }
}