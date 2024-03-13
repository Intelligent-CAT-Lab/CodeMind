import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.next();
        char[] al = new char[26];
        for (int idx = 0; idx < 26; idx++) {
            al[idx] = (char) (idx + 97);
        }
        int index = new String(al).indexOf(C);
        if (index != -1 && index < 25) {
            System.out.println(al[index + 1]);
        }
    }
}