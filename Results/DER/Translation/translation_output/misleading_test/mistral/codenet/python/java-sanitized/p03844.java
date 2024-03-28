import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        String s = split[2];
        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}