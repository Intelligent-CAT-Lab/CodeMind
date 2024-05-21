import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        String[] list = new String[words.length];
        int count = 0;

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list[count] = word;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(list[i] + " ");
        }
    }
}