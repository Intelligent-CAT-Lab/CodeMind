import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " ,.?! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(String.valueOf(t.charAt(i)), " " + t.charAt(i) + " ");
        }
        s = " ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" " + t.charAt(i), String.valueOf(t.charAt(i)));
        }
        System.out.println(s);
    }
}