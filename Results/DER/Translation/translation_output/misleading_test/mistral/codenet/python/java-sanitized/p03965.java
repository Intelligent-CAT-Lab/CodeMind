import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = (s.length() - 1) / 2 - s.count('p');
        System.out.println(result);
    }
}