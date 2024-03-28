import java.util.Scanner;

public class p02394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (arr[2] + arr[4] <= arr[0]) {
            if (arr[2] - arr[4] >= 0) {
                if (arr[3] + arr[4] <= arr[1]) {
                    if (arr[3] - arr[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}