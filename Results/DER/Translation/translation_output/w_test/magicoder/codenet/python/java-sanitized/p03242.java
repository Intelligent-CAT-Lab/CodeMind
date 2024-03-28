import java.util.Scanner;

public class p03242 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                ans.append('9');
            } else {
                ans.append('1');
            }
        }
        System.out.println(ans.reverse().toString());
    }
}