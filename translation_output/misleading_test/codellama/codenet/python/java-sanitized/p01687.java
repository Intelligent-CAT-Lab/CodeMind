import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        if (input.length() < 8) {
            output = input;
        } else {
            String ref = "AADINNUY";
            String aizu = "AIZUNYAN";
            int i = 0;
            while (i < input.length()) {
                if (i <= input.length() - 8 && input.substring(i, i + 8).equals(ref)) {
                    output += aizu;
                    i += 8;
                } else {
                    output += input.charAt(i);
                    i++;
                }
            }
        }
        System.out.println(output);
    }
}