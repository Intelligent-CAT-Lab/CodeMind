import java.util.Scanner;

public class p03698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char member = s.charAt(i);
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                char member2 = s.charAt(j);
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}