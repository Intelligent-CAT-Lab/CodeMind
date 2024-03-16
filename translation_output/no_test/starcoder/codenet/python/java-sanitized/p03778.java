import java.util.*;
public class p03778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a-b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a-b) - w);
        }
    }
}