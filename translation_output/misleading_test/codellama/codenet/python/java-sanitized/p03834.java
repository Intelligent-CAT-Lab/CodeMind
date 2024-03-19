import java.util.Scanner;

public class p03834 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");
        String output = "";
        for (int i = 0; i < words.length - 1; i++) {
            output += words[i] + " ";
        }
        output += words[words.length - 1];
        System.out.println(output);
    }
}