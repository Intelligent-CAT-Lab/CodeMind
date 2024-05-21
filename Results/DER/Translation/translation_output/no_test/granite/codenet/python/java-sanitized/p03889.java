import java.util.*;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = new StringBuilder(s).reverse().toString();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < tArray.length; i++) {
            if (tArray[i] == 'p') {
                tArray[i] = 'q';
            } else if (tArray[i] == 'q') {
                tArray[i] = 'p';
            }
            if (tArray[i] == 'b') {
                tArray[i] = 'd';
            } else if (tArray[i] == 'd') {
                tArray[i] = 'b';
            }
        }
        String ans = "No";
        if (Arrays.equals(sArray, tArray)) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}