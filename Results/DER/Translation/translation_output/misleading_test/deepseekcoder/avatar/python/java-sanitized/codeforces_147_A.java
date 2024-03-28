import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " ,.?! ";
        for (char c : t.toCharArray()) {
            s = s.replace(Character.toString(c), " â " + c);
        }
        s = " â ".join(s.strip().split(" "));
        for (char c : t.toCharArray()) {
            s = s.replace(" â " + c, Character.toString(c));
        }
        System.out.println(s);
    }
}