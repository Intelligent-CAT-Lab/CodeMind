import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        b = Integer.parseInt(split[1].substring(0, split[1].length() - 1));
        int result = a + b;
        System.out.println(result);
    }
}


Sample test case:

35005211 521595368


Expected output:

898600307