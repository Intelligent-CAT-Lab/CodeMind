import java.util.Scanner;

public class p00050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace("apple", "temp").replace("peach", "apple").replace("temp", "peach");
        System.out.println(output);
    }
}