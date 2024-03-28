import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " , . ? ! ";
        for (char c : t.toCharArray()) {
            s = s.replace(c, c + "  ");
        }
        s = "  ".join(s.split(" "));
        for (char c : t.toCharArray()) {
            s = s.replace("  " + c, c);
        }
        System.out.println(s);
    }
}