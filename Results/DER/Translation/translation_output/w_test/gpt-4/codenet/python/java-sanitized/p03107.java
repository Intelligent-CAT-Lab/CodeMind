import java.util.Scanner;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                count0++;
            } else if (input.charAt(i) == '1') {
                count1++;
            }
        }

        System.out.println(2 * Math.min(count0, count1));
    }
}