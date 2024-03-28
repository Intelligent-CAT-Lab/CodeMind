import java.util.Scanner;

public class p03610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}