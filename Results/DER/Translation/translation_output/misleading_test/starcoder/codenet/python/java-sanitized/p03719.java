import java.util.*;

public class p03719 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b >= c && c >= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}