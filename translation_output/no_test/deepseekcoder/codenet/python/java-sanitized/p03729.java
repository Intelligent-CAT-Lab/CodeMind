import java.util.Scanner;

public class p03729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        if (input[0].charAt(input[0].length() - 1) == input[1].charAt(0) && input[1].charAt(input[1].length() - 1) == input[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}