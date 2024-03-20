import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'i' || chars[i] == 'n') {
                count++;
            }
        }
        System.out.println(input.charAt(0) + "" + count + input.charAt(input.length() - 1));
    }
}