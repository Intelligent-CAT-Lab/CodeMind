import java.util.*;
public class p03316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i) + "");
        }
        if (sum % Integer.parseInt(n) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}