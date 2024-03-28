import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
        }
        System.out.println(tmp == 0 ? "Yes" : "No");
    }
}