import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.nextLine();
        char[] al = new char[26];
        for (int i = 0; i < 26; i++) {
            al[i] = (char) (i + 97);
        }
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (al[i] == C.charAt(0)) {
                idx = i;
                break;
            }
        }
        System.out.println(al[idx + 1]);
    }
}