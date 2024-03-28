import java.util.*;
public class p03071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] list = new int[3];
        list[0] = a + b;
        list[1] = 2 * a - 1;
        list[2] = 2 * b - 1;
        System.out.println(Math.max(list[0], Math.max(list[1], list[2])));
    }
}