import java.util.Scanner;

public class p03698 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (char member : s.toCharArray()) {
            count = 0;
            for (char member2 : s.toCharArray()) {
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
            if (count == 1) {
                System.out.println("yes");
            }
        }
    }
}