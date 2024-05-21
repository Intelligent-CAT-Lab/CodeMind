import java.util.*;

public class p03071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] list = {A+B, 2*A-1, 2*B-1};
        Arrays.sort(list);
        System.out.println(list[2]);
    }
}