import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int f = Integer.parseInt(split[0]);
        int t = Integer.parseInt(split[1]);
        int count = 0;
        for (int i = f; i <= t; i++) {
            String str = Integer.toString(i);
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}