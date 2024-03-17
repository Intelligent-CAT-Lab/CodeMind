import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        code = code.replaceAll(",","");
        code = code.replaceAll("\\.","");
        String[] words = code.split("\\s+");
        String[] result = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                result[count++] = word;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}