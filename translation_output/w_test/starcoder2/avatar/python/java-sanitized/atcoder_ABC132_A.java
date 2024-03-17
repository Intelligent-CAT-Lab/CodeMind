import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s1 = s.toCharArray();
        int[] s2 = new int[4];
        for (int i = 0; i < 4; i++) {
            s2[i] = (int) s1[i];
        }
        Arrays.sort(s2);
        if (s2[0] == s2[1] && s2[2] == s2[3] && s2[0] != s2[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}