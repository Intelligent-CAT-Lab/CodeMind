import java.util.Scanner;

public class p03698 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean isUnique = true;

        for (int i = 0; i < s.length(); i++) {
            char member = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                char member2 = s.charAt(j);
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            System.out.println("yes");
        }

        scanner.close();
    }
}