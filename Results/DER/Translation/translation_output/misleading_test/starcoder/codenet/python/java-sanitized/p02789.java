import java.util.*;
public class p02789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        if (a[0] == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}