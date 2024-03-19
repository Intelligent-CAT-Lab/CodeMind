import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        System.out.println(a + b.length() + c);
    }
}



You can test this code with the following test input:


internationalization