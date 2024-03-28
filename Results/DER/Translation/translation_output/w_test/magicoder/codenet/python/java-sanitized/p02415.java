import java.util.Scanner;

public class p02415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toLowerCase().replace(s.substring(0, 1), s.substring(0, 1).toUpperCase())
                .replace(s.substring(s.indexOf(" ") + 1, s.indexOf(" ", s.indexOf(" ") + 1)),
                        s.substring(s.indexOf(" ") + 1, s.indexOf(" ", s.indexOf(" ") + 1)).toLowerCase())
                .replace(s.substring(s.lastIndexOf(" ") + 1),
                        s.substring(s.lastIndexOf(" ") + 1).toLowerCase()));
    }
}