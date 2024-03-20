import java.util.*;

public class p04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("[AEIOUaeiou]", "");
        s = s.replaceAll("[^NSWEnswe]", "");
        if (s.length() == 4) {
            System.out.println("Yes");
        } else if (s.length() == 3) {
            System.out.println("No");
        } else if (s.length() == 2) {
            if (s.contains("N") && s.contains("S")) {
                System.out.println("Yes");
            } else if (s.contains("E") && s.contains("W")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}