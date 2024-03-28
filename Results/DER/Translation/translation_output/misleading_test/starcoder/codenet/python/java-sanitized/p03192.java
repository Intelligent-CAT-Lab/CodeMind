import java.util.*;
public class p03192 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        System.out.println(N.replaceAll("2", "").length());
    }
}