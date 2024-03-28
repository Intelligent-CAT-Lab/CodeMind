import java.util.*;
public class p03591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println("Yes" if S.substring(0,4).equals("YAKI") else "No");
    }
}