import java.util.Scanner;
import java.util.Arrays;

public class p03618 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        String sortedS = new String(sArr);
        
        int res = (sortedS.length() * (sortedS.length() - 1)) / 2 + 1;
        
        for (int i = 0; i < sortedS.length(); i++) {
            int count = 1;
            while (i < sortedS.length() - 1 && sortedS.charAt(i) == sortedS.charAt(i + 1)) {
                count++;
                i++;
            }
            res -= (count * (count - 1)) / 2;
        }

        System.out.println(res);
    }
}