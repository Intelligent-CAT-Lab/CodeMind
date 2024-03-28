import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n.substring(i, i + 1))) % 9;
        }
        if (tmp == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}