import java.util.*;
public class p00376 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}