import java.util.*;
public class p03945 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(s.replaceAll("W", "").replaceAll("B", "").length());
    }
}