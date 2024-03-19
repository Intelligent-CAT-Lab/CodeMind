import java.util.*;

public class p00018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}