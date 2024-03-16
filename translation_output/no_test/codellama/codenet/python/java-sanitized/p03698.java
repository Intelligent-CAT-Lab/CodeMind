import java.util.Scanner;

public class p03698 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cCount = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    cCount++;
                }
            }
            if (cCount >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}