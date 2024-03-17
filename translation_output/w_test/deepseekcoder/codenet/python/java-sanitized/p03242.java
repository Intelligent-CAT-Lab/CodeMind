import java.util.Scanner;

public class p03242 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            ans.append(input.charAt(i) == '1' ? '9' : '1');
        }
        System.out.println(ans.toString());
    }
}