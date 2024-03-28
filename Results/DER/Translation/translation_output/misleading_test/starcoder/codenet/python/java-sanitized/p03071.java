import java.util.*;
public class p03071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] list = new int[3];
        list[0] = A+B;
        list[1] = 2*A-1;
        list[2] = 2*B-1;
        System.out.println(Math.max(list[0], Math.max(list[1], list[2])));
    }
}