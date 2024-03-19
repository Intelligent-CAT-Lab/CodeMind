import java.util.Scanner;

public class p03605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String numStr = Integer.toString(num);
        if (numStr.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}