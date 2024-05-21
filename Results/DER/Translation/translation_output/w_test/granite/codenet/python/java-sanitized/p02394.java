import java.util.Scanner;

public class p02394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[2] + arr[4] <= arr[0] && arr[2] - arr[4] >= 0 && arr[3] + arr[4] <= arr[1] && arr[3] - arr[4] >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}