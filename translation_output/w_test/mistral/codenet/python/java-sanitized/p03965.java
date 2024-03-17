import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.length() / 2 - s.count('p'));
    }
}