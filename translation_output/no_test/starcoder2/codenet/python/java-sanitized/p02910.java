import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};
        for (int i = 0; i < s.length(); i += 2) {
            boolean flag = false;
            for (int j = 0; j < odd.length; j++) {
                if (s.charAt(i) == odd[j].charAt(0)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 1; i < s.length(); i += 2) {
            boolean flag = false;
            for (int j = 0; j < even.length; j++) {
                if (s.charAt(i) == even[j].charAt(0)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}