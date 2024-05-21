import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[2]);
        char s = input[1].charAt(0);
        if (s == '+') {
            System.out.println(A + B);
        } else if (s == '-') {
            System.out.println(A - B);
        }
    }
}