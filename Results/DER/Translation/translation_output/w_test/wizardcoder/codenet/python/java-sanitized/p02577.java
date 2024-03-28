import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
        }
        System.out.println("Yes");
        if (tmp!= 0) {
            System.out.println("No");
        }
    }
}