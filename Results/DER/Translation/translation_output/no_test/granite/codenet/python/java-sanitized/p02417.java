import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] A = new char[1000];
        int index = 0;
        while (scanner.hasNext()) {
            String S = scanner.nextLine();
            for (int i = 0; i < S.length(); i++) {
                char s = S.charAt(i);
                if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
                    A[index++] = Character.toLowerCase(s);
                }
            }
        }

        int[] D = new int[26];
        for (int i = 0; i < index; i++) {
            char s = A[i];
            D[s - 'a']++;
        }

        char[] Str = new char[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = (char) (i + 'a');
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(Str[i] + " ");
            System.out.print(": ");
            System.out.println(D[i]);
        }
    }
}