import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[2] == arr[3] && arr[0]!= arr[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}