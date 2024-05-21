import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list.add(word);
            }
        }

        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}