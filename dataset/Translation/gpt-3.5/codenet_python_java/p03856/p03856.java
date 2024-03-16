import java.util.Scanner;

public class p03856 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};

        int[] numlist = new int[6];
        for (int i = 0; i < a.length; i++) {
            numlist[i] = countSubstring(s, a[i]);
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]); // Adjust for dreamer
        numlist[0] += (numlist[4] + numlist[5]); // Adjust for dream

        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        
        if (total == s.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int countSubstring(String str, String subStr) {
        int count = 0;
        int idx = str.indexOf(subStr);
        while (idx != -1) {
            count++;
            idx = str.indexOf(subStr, idx + 1);
        }
        return count;
    }
}