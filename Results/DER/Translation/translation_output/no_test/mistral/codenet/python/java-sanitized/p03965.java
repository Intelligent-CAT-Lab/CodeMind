import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = (s.length() - s.replace("p", "").length()) / 2;
        System.out.println(result);
    }
}