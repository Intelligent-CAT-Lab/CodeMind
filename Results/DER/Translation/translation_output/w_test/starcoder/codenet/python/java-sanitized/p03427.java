import java.util.*;
public class p03427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(Math.max(Integer.parseInt(n.charAt(0))-1+9*(n.length()-1),
                Integer.parseInt(n)));
    }
}