import java.util.Scanner;

public class p02987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        
        if(chars[0] == chars[1] && chars[1] == chars[2] && chars[2] == chars[3]) {
            System.out.println("No");
        } else if(chars[0] == chars[1] && chars[1] == chars[3] || chars[0] == chars[2] && chars[2] == chars[3] || chars[1] == chars[2] && chars[2] == chars[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}