import java.util.Arrays;
import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        String ref = "AADINNUY";
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
                if (i <= l - 8 && isRefSorted(ref, inp.substring(i, i + 8))) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans);
        }
        
        scanner.close();
    }

    private static boolean isRefSorted(String ref, String subset) {
        char[] refArray = ref.toCharArray();
        char[] subsetArray = subset.toCharArray();
        Arrays.sort(refArray);
        Arrays.sort(subsetArray);
        return Arrays.equals(refArray, subsetArray);
    }
}