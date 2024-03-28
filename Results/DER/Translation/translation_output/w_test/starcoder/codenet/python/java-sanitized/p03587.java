import java.util.*;
public class p03587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.length() - s.replace("1", "").length());
    }
}