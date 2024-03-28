import java.util.*;
public class p03759 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}