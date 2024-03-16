import java.util.*;
public class p03369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(700+100*s.length()-s.replaceAll("o","").length());
    }
}