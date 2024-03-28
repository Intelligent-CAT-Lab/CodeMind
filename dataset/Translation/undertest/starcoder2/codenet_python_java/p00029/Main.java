import java.util.*;
public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int max = 0;
        String maxStr = "";
        for (String s : a) {
            int count = 0;
            for (String s2 : a) {
                if (s.equals(s2)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxStr = s;
            }
        }
        System.out.println(maxStr);
        int maxLen = 0;
        String maxLenStr = "";
        for (String s : a) {
            if (s.length() > maxLen) {
                maxLen = s.length();
                maxLenStr = s;
            }
        }
        System.out.println(maxLenStr);
    }
}