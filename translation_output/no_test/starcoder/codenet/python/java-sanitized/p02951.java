import java.util.*;
public class p02951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int get = A - B;
        int i = C - get;
        if (i < 0) {
            i = 0;
        }
        System.out.println(i);
    }
}