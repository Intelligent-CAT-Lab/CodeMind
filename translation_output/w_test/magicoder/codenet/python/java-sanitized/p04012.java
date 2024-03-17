import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        scanner.close();

        for (char c : alfa.toCharArray()) {
            if (countChar(w, c) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}