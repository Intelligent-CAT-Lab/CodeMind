import java.util.*;

public class p01687 {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = sc.nextLine();
        if (inp.length() < 8) {
            System.out.println("Input string is too short.");
        } else {
            String ans = "";
            for (int i = 0; i < inp.length(); i++) {
                if (i <= inp.length() - 8 && inp.substring(i, i + 8).equals(ref)) {
                    ans += aizu;
                    i += 8;
                } else {
                    ans += inp.charAt(i);
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}