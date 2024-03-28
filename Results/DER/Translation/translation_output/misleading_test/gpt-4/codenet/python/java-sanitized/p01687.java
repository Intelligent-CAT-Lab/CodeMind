import java.util.Arrays;
import java.util.Scanner;

public class p01687 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = transform(input);
        System.out.println(result);
        scanner.close();
    }

    private static String transform(String input) {
        char[] ref = new char[]{'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        String aizu = "AIZUNYAN";
        
        if (input.length() < 8) {
            return input;
        } else {
            StringBuilder ans = new StringBuilder();
            int i = 0;
            while (i < input.length()) {
                if (i <= input.length() - 8) {
                    char[] subArray = input.substring(i, i + 8).toCharArray();
                    Arrays.sort(subArray);
                    if (Arrays.equals(subArray, ref)) {
                        ans.append(aizu);
                        i += 8;
                        continue;
                    }
                }
                ans.append(input.charAt(i));
                i++;
            }
            return ans.toString();
        }
    }
}