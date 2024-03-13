import java.util.*;

public class p01687 {
    public static void main(String[] args) {
        List<Character> ref = Arrays.asList('A', 'D', 'I', 'N', 'U', 'Y');
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8) {
                    List<Character> subList = new ArrayList<>();
                    for (int j = i; j < i + 8; j++) {
                        subList.add(inp.charAt(j));
                    }
                    Collections.sort(subList);
                    if (subList.equals(ref)) {
                        ans.append(aizu);
                        i += 8;
                    } else {
                        ans.append(inp.charAt(i));
                        i += 1;
                    }
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }
}