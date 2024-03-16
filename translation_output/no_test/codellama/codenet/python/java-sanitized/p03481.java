import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(int[]::new);
        int X = n[0];
        int Y = n[1];

        int k = (int) Math.floor(Math.log(Y / X) / Math.log(2));
        System.out.println(k);
    }
}