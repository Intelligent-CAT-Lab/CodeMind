import java.util.Scanner;

public class p02212 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        int diff = Math.abs((l[0] + l[3]) - (l[1] + l[2]));
        System.out.println(diff);
    }
}