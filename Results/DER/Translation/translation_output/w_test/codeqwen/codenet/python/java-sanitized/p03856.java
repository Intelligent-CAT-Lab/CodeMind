import java.util.Scanner;

public class p03856 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = new int[6];

        for (int i = 0; i < a.length; i++) {
            numlist[i] = S.split(a[i]).length - 1;
        }

        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);   //èª¤ã£ã¦dreamerã§æ°ããåã
        numlist[0] += (numlist[4] + numlist[5]);   //dreamã«è¨ä¸ããªãã

        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}