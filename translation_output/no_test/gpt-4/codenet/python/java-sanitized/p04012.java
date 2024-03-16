import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        String w = scanner.nextLine();
        boolean isEven = true;

        for (int i = 0; i < alfa.length(); i++) {
            char c = alfa.charAt(i);
            long count = w.chars().filter(ch -> ch == c).count();
            if (count % 2 == 1) {
                System.out.println("No");
                isEven = false;
                break;
            }
        }

        if (isEven) {
            System.out.println("Yes");
        }

        scanner.close();
    }
}