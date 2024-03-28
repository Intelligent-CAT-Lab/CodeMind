import java.util.Scanner;

public class p03248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }

        String sd = s.substring(0, s.length() - 1) + '1';
        int[] plist = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist[i] = i;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int r = Arrays.binarySearch(plist, i);
            System.out.println(i + 1 + plist[r] + 1);
        }
    }
}


Otherwise, it iterates over the string and checks if the characters at each position are the same as the characters at the opposite position. If they are not the same, it prints -1 and exits.