import java.util.*;
public class p03844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        String op = sc.nextLine();
        if (op.equals("+")) {
            System.out.println(a+b);
        } else if (op.equals("-")) {
            System.out.println(a-b);
        }
    }
}