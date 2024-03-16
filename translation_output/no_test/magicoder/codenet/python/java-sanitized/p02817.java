import java.util.Scanner;

public class p02817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String S = input[0];
        String T = input[1];

        System.out.println(T + S);
    }
}