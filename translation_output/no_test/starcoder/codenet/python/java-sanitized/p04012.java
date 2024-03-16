import java.util.*;
public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alfa.length(); i++) {
            if (s.indexOf(alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}