import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String output = "";
        int capitalCount = 0;
        int smallCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                smallCount++;
            } else {
                capitalCount++;
            }
        }
        if (smallCount >= capitalCount) {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                output += Character.toLowerCase(c);
            }
        } else {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                output += Character.toUpperCase(c);
            }
        }
        System.out.println(output);
    }
}