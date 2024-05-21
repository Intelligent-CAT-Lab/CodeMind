import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        String s = input[1];
        int B = Integer.parseInt(input[2]);
        int result = 0;
        if (s.equals("+")) {
            result = A + B;
        } else if (s.equals("-")) {
            result = A - B;
        }
        System.out.println(result);
    }
}