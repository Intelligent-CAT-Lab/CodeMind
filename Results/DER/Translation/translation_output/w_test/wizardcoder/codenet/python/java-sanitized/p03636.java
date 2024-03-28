import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        System.out.println(input.substring(0, count) + input.substring(count, input.length()));
    }
}