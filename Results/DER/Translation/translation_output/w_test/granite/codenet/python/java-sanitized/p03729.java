import java.util.Scanner;

public class p03729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        if (words[0].charAt(words[0].length() - 1) == words[1].charAt(0) &&
                words[1].charAt(words[1].length() - 1) == words[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}