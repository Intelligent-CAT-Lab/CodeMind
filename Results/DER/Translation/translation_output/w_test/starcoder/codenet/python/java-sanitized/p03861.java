import java.util.*;
public class p03861 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int result = b / x - (a - 1) / x;
        System.out.println(result);
    }
}