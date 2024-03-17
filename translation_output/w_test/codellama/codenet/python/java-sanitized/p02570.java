import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = sc.nextLine().split(" ").map(Integer::parseInt).toArray(int[]::new);
        if (data[0] / data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}