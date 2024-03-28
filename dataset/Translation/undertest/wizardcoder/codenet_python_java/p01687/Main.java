import java.util.*;

public class p01687 {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            String ans = "";
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && isSorted(inp.substring(i, i+8), ref)) {
                    ans += aizu;
                    i += 8;
                } else {
                    ans += inp.charAt(i);
                    i++;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean isSorted(String s, String ref) {
        char[] arr = s.toCharArray();
        char[] refArr = ref.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(refArr);
        return Arrays.equals(arr, refArr);
    }
}