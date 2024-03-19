import java.util.Scanner;

public class p02004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'R') {
                count++;
                if (count == 4) {
                    result++;
                    count = 0;
                }
            } else {
                count--;
                if (count == -4) {
                    count = 0;
                }
            }
        }
        System.out.println(result);
    }
}