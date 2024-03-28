import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String firstLetter = words[0].substring(0, 1).toUpperCase();
        String secondLetter = words[1].substring(0, 1).toUpperCase();
        String thirdLetter = words[2].substring(0, 1).toUpperCase();
        System.out.println(firstLetter + secondLetter + thirdLetter);
    }
}