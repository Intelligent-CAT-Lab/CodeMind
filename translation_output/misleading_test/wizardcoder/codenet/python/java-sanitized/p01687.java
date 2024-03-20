import java.util.*;

public class p01687 {
    public static void main(String[] args) {
        List<Character> ref = new ArrayList<>(Arrays.asList('A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'));
        String aizu = "AIZUNYAN";
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && new ArrayList<>(Arrays.asList(inp.substring(i, i+8).toCharArray())).equals(ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}