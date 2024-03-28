import java.util.Scanner;

public class p03369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int countO = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                countO++;
            }
        }
        
        int result = 700 + 100 * countO;
        System.out.println(result);
    }
}