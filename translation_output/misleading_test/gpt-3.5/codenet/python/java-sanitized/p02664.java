import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        char[] aArray = a.toCharArray();
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == '?') {
                aArray[i] = 'D';
            }
        }

        StringBuilder b = new StringBuilder();
        for (char c : aArray) {
            b.append(c);
        }

        System.out.println(b.toString());
    }
}