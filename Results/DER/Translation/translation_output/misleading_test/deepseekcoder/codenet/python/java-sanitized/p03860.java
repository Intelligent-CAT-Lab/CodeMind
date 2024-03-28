import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        System.out.println("A" + words[1].charAt(0) + "C");
    }
}