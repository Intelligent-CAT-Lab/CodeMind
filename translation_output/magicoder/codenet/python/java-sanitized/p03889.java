import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < tArray.length; i++) {
            if (tArray[i] == 'p') {
                tArray[i] = 'q';
            } else if (tArray[i] == 'q') {
                tArray[i] = 'p';
            }
            if (tArray[i] == 'b') {
                tArray[i] = 'd';
            } else if (tArray[i] == 'd') {
                tArray[i] = 'b';
            }
        }
        String ans = new String(tArray);
        if (s.equals(ans)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}