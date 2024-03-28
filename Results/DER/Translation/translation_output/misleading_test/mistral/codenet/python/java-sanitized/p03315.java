import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = a.count("+");
        int f = a.count("-");
        System.out.println(e - f);
    }
}