import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        int small = 0;
        int cap = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < input.length(); i++) {
                output += Character.toLowerCase(input.charAt(i));
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                output += Character.toUpperCase(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}