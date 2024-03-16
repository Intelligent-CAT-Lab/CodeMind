import java.util.Scanner;

public class p00494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        int i = 0, ans = 0;
        while (i < len) {
            int lenJ = 0, lenO = 0, lenI = 0;
            while (i < len && input.charAt(i) == 'J') {
                lenJ++;
                i++;
            }
            while (i < len && input.charAt(i) == 'O') {
                lenO++;
                i++;
            }
            while (i < len && input.charAt(i) == 'I') {
                lenI++;
                i++;
            }
            if (lenJ >= lenO && lenI >= lenO) {
                ans = Math.max(ans, lenO);
            }
        }
        System.out.println(ans);
    }
}