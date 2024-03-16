import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int a = 99999;
        
        for (int i = 0; i < S.length() - 2; i++) {
            int num = Integer.parseInt(S.substring(i, i+3));
            a = Math.min(Math.abs(753 - num), a);
        }
        
        System.out.println(a);
    }
}