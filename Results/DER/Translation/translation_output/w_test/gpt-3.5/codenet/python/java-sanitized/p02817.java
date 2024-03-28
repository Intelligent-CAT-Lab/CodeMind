import java.util.Scanner;

public class p02817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String S = parts[0];
        String T = parts[1];

        System.out.println(T + S);
    }
}