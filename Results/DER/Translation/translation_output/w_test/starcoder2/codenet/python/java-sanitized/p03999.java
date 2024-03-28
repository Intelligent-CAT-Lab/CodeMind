import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String pat) {
        int ans = 0;
        String[] s = pat.split("\\+");
        for (int i = 0; i < s.length; i++) {
            ans += Integer.parseInt(s[i]);
        }
        return ans;
    }
}

/docs/leetcode/0001-0050/0001-0010.md