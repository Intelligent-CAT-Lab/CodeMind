import java.util.Scanner;

public class p02546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}