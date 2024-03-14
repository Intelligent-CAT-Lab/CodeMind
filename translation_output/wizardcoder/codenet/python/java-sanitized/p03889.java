import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] sArr = s.toCharArray();
        char[] tArr = new char[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == 'p') {
                tArr[i] = 'q';
            } else if (sArr[i] == 'q') {
                tArr[i] = 'p';
            } else if (sArr[i] == 'b') {
                tArr[i] = 'd';
            } else if (sArr[i] == 'd') {
                tArr[i] = 'b';
            }
        }
        String t = new String(tArr);
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}