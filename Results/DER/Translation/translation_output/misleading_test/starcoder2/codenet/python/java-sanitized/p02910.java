import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String odd = "RUD";
        String even = "LUD";
        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(s.substring(i, i + 1))) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 1; i < s.length(); i += 2) {
            if (!even.contains(s.substring(i, i + 1))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}