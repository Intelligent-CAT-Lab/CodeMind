import java.util.*;

public class p03856 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] a = {"dream","dreamer","erase","eraser","dreamerase","dreameraser"};
        int[] numlist = new int[7];
        for (int i = 0; i < 6; i++) {
            numlist[i] = S.length() - S.replace(a[i], "").length();
        }
        numlist[6] = numlist[4] + numlist[5];
        numlist[4] -= numlist[6];
        numlist[0] += numlist[6];
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}