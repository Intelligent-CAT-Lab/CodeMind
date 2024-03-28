import java.util.*;
public class codeforces_147_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = ",.?! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i), t.charAt(i) + " â ");
        }
        s = " â ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" â " + t.charAt(i), t.charAt(i));
        }
        System.out.println(s);
    }
}