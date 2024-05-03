import java.util.Scanner;

public class p02766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int i = 0;

        while (n / (int) Math.pow(k, i) != 0) {
            i += 1;
        }

        System.out.println(i);
    }
}