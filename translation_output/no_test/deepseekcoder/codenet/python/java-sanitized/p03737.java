import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] words = input.split(" ");
        System.out.println(words[0].charAt(0) + "" + words[1].charAt(0) + "" + words[2].charAt(0));
    }
}