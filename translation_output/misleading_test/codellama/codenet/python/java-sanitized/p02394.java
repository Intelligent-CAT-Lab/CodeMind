import java.util.Scanner;

public class p02394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = sc.nextLine().split(" ").map(Integer::parseInt).toArray(new int[0]);

        if (input[2] + input[4] <= input[0]) {
            if (input[2] - input[4] >= 0) {
                if (input[3] + input[4] <= input[1]) {
                    if (input[3] - input[4] >= 0) {
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