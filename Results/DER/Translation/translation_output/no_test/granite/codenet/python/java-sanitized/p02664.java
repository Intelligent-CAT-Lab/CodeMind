import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                charArray[i] = 'D';
            }
        }
        String output = new String(charArray);
        System.out.println(output);
    }
}