import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " , . ? ! ";

        for (char i : t.toCharArray()) {
            s = s.replace(String.valueOf(i), i + " â ");
        }

        s = " â ".join(s.trim().split(" "));

        for (char i : t.toCharArray()) {
            s = s.replace(" â " + i, String.valueOf(i));
        }

        System.out.println(s);
    }
}