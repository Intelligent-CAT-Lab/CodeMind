import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        String s = input[1];
        int B = Integer.parseInt(input[2]);

        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }

        scanner.close();
    }
}