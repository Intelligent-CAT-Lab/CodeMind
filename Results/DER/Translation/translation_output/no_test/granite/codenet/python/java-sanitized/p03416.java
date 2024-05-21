import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int f = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int count = 0;
        for (int i = f; i <= t; i++) {
            String num = String.valueOf(i);
            if (num.equals(new StringBuilder(num).reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}