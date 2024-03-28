import java.util.*;
public class p02885 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = arr[0] - arr[1] * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}