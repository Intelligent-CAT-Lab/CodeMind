import java.util.Scanner;

public class p03029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int p = Integer.parseInt(parts[1]);
        System.out.println((3*a+p)/2);
    }
}