import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] splitInput = input.split(" ");
        System.out.println("" + splitInput[0].charAt(0) + splitInput[1].charAt(0) + splitInput[2].charAt(0));
    }
}