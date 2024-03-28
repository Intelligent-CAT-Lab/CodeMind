import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] words = input.split(" ");
        String result = words[0].substring(0, 1) + words[1].substring(0, 1) + words[2].substring(0, 1);
        System.out.println(result);
    }
}